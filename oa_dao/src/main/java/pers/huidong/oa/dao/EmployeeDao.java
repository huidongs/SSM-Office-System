package pers.huidong.oa.dao;

import org.springframework.stereotype.Repository;
import pers.huidong.oa.entity.Employee;

import java.util.List;

/**
 * @auther huidong
 * @date 2020/5/4 17:04
 */
@Repository("employeeDao")
public interface EmployeeDao {
    void insert(Employee employee);
    void delete(String sn);
    void update(Employee employee);
    Employee select(String sn);
    List<Employee> selectAll();
}
