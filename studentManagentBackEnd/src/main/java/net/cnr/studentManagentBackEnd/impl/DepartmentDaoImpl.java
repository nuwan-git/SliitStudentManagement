package net.cnr.studentManagentBackEnd.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.cnr.studentManagentBackEnd.dao.DepartmentDao;
import net.cnr.studentManagentBackEnd.dto.Department;

@Repository("departmentDao")
@Transactional
public class DepartmentDaoImpl implements DepartmentDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Department get(int id) {

		return sessionFactory.getCurrentSession().get(Department.class, Integer.valueOf(id));
	}

	@Override
	public List<Department> list() {

		String selectQuery = "FROM Department";

		return sessionFactory.getCurrentSession().createQuery(selectQuery, Department.class).getResultList();

	}

	@Override
	public boolean add(Department department) {

		try {
			sessionFactory.getCurrentSession().persist(department);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean update(Department department) {
		try {
			sessionFactory.getCurrentSession().update(department);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public boolean delete(Department department) {
		try {
			department.setActive(false);
			sessionFactory.getCurrentSession().update(department);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}
