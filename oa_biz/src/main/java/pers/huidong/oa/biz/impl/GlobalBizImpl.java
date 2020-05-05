package pers.huidong.oa.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.huidong.oa.biz.GlobalBiz;
import pers.huidong.oa.dao.EmployeeDao;
import pers.huidong.oa.entity.Employee;

/**
 * @program: oa
 * @auther: HuiDong
 * @date: 2020/5/4 22:07
 * @description:
 */
@Service("globalBiz")
public class GlobalBizImpl implements GlobalBiz {

    @Autowired
    private EmployeeDao employeeDao;
    public Employee login(String sn, String password) {
        Employee employee = employeeDao.select(sn);
        if (employee!=null&&employee.getPassword().equals(password)) {
            return employee;
        }
        return null;
    }

    public void changePassword(Employee employee) {
        employeeDao.update(employee);
    }
}
