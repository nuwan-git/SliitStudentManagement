package net.cnr.studentManagentBackEnd.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.cnr.studentManagentBackEnd.dao.TeacherDao;
import net.cnr.studentManagentBackEnd.dto.Teacher;

@Repository("teacherDao")
@Transactional
public class TeacherDaoImpl implements TeacherDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Teacher get(int teacherId) {

		return sessionFactory.getCurrentSession().get(Teacher.class, Integer.valueOf(teacherId));
	}

	@Override
	public List<Teacher> list() {
		return sessionFactory.getCurrentSession().createQuery("From Teacher", Teacher.class).getResultList();
	}

	@Override
	public boolean add(Teacher teacher) {
		try {
			sessionFactory.getCurrentSession().persist(teacher);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Teacher teacher) {

		try {
			sessionFactory.getCurrentSession().update(teacher);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public boolean delete(Teacher teacher) {

		try {
			teacher.setActive(false);
			sessionFactory.getCurrentSession().update(teacher);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Teacher> listActiveTeachers() {
		String selectActiveTeacher = "FROM Teacher WHERE active = :active";

		return sessionFactory.getCurrentSession().createQuery(selectActiveTeacher, Teacher.class)
				.setParameter("active", true).getResultList();
	}

	@Override
	public List<Teacher> listActiveTeachersByExperienceYears(int noYears) {
		String selectActiveTeacherByExperience = "FROM Teacher WHERE experienceYears = :years";
		return sessionFactory.getCurrentSession().createQuery(selectActiveTeacherByExperience, Teacher.class)
				.setParameter("years", noYears).getResultList();
	}

	@Override
	public List<Teacher> listActiveTeachersByDepartmentId(Integer departmentId) {
		String selectActiveTeachersByDepartmentId = "FROM Teacher WHERE departmentId = :departmentId and active = :active";

		return sessionFactory.getCurrentSession().createQuery(selectActiveTeachersByDepartmentId, Teacher.class)
				.setParameter("departmentId", departmentId).setParameter("active", true).getResultList();
	}

}
