package pers.huidong.oa.dao;

import org.springframework.stereotype.Repository;
import pers.huidong.oa.entity.Department;

import java.util.List;

/**
 * @auther huidong
 * @date 2020/5/3 11:12
 */
@Repository("departmentDao")
public interface DepartmentDao {
    void insert(Department department);
    void update(Department department);
    void delete(String sn);
    Department select(String sn);
    List<Department> selectAll();
}
