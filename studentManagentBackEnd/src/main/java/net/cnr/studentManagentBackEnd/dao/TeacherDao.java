package net.cnr.studentManagentBackEnd.dao;

import java.util.List;

import net.cnr.studentManagentBackEnd.dto.Teacher;

public interface TeacherDao {

	Teacher get(int teacherId);

	List<Teacher> list();

	boolean add(Teacher teacher);

	boolean update(Teacher teacher);

	boolean delete(Teacher teacher);

	// business methods
	List<Teacher> listActiveTeachers();

	List<Teacher> listActiveTeachersByExperienceYears(int noYears);

	List<Teacher> listActiveTeachersByDepartmentId(Integer departmentId);

}
