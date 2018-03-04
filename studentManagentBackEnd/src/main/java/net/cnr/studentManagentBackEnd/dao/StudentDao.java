package net.cnr.studentManagentBackEnd.dao;

import java.util.List;

import net.cnr.studentManagentBackEnd.dto.Student;

public interface StudentDao {

	List<Student> list();
	
	Student get(int id);

	boolean add(Student student);

	boolean update(Student student);

	
}
