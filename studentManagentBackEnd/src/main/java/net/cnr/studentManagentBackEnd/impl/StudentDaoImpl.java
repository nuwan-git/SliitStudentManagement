package net.cnr.studentManagentBackEnd.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.cnr.studentManagentBackEnd.dao.StudentDao;
import net.cnr.studentManagentBackEnd.dto.Student;

@Repository("studentDao")
@Transactional
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public List<Student> list() {
		return sessionfactory.getCurrentSession().createQuery("FROM Student", Student.class).getResultList();
	}

	@Override
	public Student get(int id) {
		return sessionfactory.getCurrentSession().get(Student.class, Integer.valueOf(id));
	}

	@Override
	public boolean add(Student student) {
		try {
			sessionfactory.getCurrentSession().persist(student);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Student student) {
		try {
			sessionfactory.getCurrentSession().update(student);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	

	
	
}
