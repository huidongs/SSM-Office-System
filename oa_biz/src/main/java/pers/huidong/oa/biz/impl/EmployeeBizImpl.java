package pers.huidong.oa.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pers.huidong.oa.biz.EmployeeBiz;
import pers.huidong.oa.dao.EmployeeDao;
import pers.huidong.oa.entity.Employee;

import java.util.List;

/**
 * @program: oa
 * @auther: HuiDong
 * @date: 2020/5/4 17:49
 * @description:
 */
@Service("employeeBiz")
public class EmployeeBizImpl implements EmployeeBiz {

    @Qualifier("employeeDao")
    @Autowired
    private EmployeeDao employeeDao;
    public void add(Employee employee) {
        employee.setPassword("huidong");
        employeeDao.insert(employee);
    }

    public void edit(Employee employee) {
        employeeDao.update(employee);
    }

    public void remove(String sn) {
        employeeDao.delete(sn);
    }

    public Employee get(String sn) {
        return employeeDao.select(sn);
    }

    public List<Employee> getAll() {
        return employeeDao.selectAll();
    }
}
