package pers.huidong.oa.biz;

import pers.huidong.oa.entity.Employee;

/**
 * @auther huidong
 * @date 2020/5/4 22:06
 */
public interface GlobalBiz {

    Employee login(String sn,String password);
    void changePassword(Employee employee);
}
