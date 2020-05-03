package pers.huidong.oa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pers.huidong.oa.biz.DepartmentBiz;

import java.util.Map;

/**
 * @program: oa
 * @auther: HuiDong
 * @date: 2020/5/3 18:34
 * @description:
 */
@Controller("departmentController")
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentBiz departmentBiz;

    //建议使用map：因为map是通用类型，不是spring独有的，具有解耦的效果，比如说以后不用springmvc了，这个类依旧可用。
    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",departmentBiz.getAll());
        return "department_list";
    }
}
