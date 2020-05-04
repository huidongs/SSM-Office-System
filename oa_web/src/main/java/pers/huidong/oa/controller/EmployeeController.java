package pers.huidong.oa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pers.huidong.oa.biz.DepartmentBiz;
import pers.huidong.oa.biz.EmployeeBiz;
import pers.huidong.oa.biz.impl.EmployeeBizImpl;
import pers.huidong.oa.entity.Department;
import pers.huidong.oa.entity.Employee;
import pers.huidong.oa.global.Contant;

import java.util.Map;

/**
 * @program: oa
 * @auther: HuiDong
 * @date: 2020/5/3 18:34
 * @description:
 */
@Controller("employeeController")
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeBiz employeeBiz;
    @Autowired
    private DepartmentBiz departmentBiz;

    //建议使用map：因为map是通用类型，不是spring独有的，具有解耦的效果，比如说以后不用springmvc了，这个类依旧可用。
    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",employeeBiz.getAll());
        return "/employee_list";
    }
    @RequestMapping("/to_add")
    public String toAdd(Map<String,Object> map ){
        map.put("employee",new Employee());
        map.put("dlist",departmentBiz.getAll());
        map.put("plist", Contant.getPosts());
        return "/employee_add";
    }
    @RequestMapping("/add")
    public String add(Employee employee ){
        employeeBiz.add(employee);
        return "redirect:list";//之间跳转到department_list是没有值的，需要先经过/list
    }

    @RequestMapping(value = "/to_update",params = "sn")
    public String toUpdate(String sn,Map<String,Object> map){
        map.put("employee",employeeBiz.get(sn));
        map.put("dlist",departmentBiz.getAll());
        map.put("plist", Contant.getPosts());
        return "/employee_update";
    }
    @RequestMapping("/update")
    public String update(Employee employee ){
        employeeBiz.edit(employee);
        return "redirect:list";
    }
    @RequestMapping(value = "/remove",params = "sn")
    public String remove(String sn){
        employeeBiz.remove(sn);
        return "redirect:list";
    }
}