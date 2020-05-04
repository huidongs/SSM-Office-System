package pers.huidong.oa.biz;

import pers.huidong.oa.entity.Department;
import pers.huidong.oa.entity.Employee;

import java.util.List;

/**
 * @auther huidong
 * @date 2020/5/3 17:08
 */
public interface EmployeeBiz {
    void add(Employee employee);
    void edit(Employee employee);
    void remove(String sn);
    Employee get(String sn);
    List<Employee> getAll();
}
