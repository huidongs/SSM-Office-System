package pers.huidong.oa.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pers.huidong.oa.biz.DepartmentBiz;
import pers.huidong.oa.dao.DepartmentDao;
import pers.huidong.oa.entity.Department;

import java.util.List;

/**
 * @program: oa
 * @auther: HuiDong
 * @date: 2020/5/3 17:16
 * @description:
 */
@Service("departmentBiz")
public class DepartmentBizImpl implements DepartmentBiz {

    @Qualifier("departmentDao")
    @Autowired
    private DepartmentDao departmentDao;

    public void add(Department department) {
        departmentDao.insert(department);
    }

    public void edit(Department department) {
        departmentDao.update(department);
    }

    public void remove(String sn) {
        departmentDao.delete(sn);
    }

    public Department get(String sn) {
        return departmentDao.select(sn);
    }

    public List<Department> getAll() {
        return departmentDao.selectAll();
    }
}
