package net.cnr.studentManagentBackEnd.dao;

import java.util.List;

import net.cnr.studentManagentBackEnd.dto.Department;

public interface DepartmentDao {

	Department get(int id);

	List<Department> list();

	boolean add(Department department);

	boolean update(Department department);

	boolean delete(Department department);

}
