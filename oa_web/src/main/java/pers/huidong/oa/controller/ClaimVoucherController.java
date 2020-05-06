package pers.huidong.oa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pers.huidong.oa.biz.ClaimVoucherBiz;
import pers.huidong.oa.dto.ClaimVoucherInfo;
import pers.huidong.oa.entity.Employee;
import pers.huidong.oa.global.Contant;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @program: oa
 * @auther: HuiDong
 * @date: 2020/5/6 10:15
 * @description:
 */
@Controller("claimVoucherController")
@RequestMapping("/claim_voucher")
public class ClaimVoucherController {

    @Autowired
    private ClaimVoucherBiz claimVoucherBiz;

    @RequestMapping("/to_add")
    public String toAdd(Map<String,Object> map){
        map.put("items", Contant.getItems());
        map.put("info", new ClaimVoucherInfo());
        return "/claim_voucher_add";
    }
    @RequestMapping("/add")
    public String add(HttpSession session, ClaimVoucherInfo info){
        Employee employee = (Employee) session.getAttribute("employee");
        claimVoucherBiz.save(info.getClaimVoucher(),info.getItems());
        return "redirect:detail?id"+info.getClaimVoucher().getId();
    }
    @RequestMapping("/detail")
    public String detail(int id,Map<String,Object> map){
        map.put("claimVoucher",claimVoucherBiz.get(id));
        map.put("items",claimVoucherBiz.getItems(id));
        map.put("records",claimVoucherBiz.getRecords(id));
        return "/claim_voucher_detail";

    }
}
