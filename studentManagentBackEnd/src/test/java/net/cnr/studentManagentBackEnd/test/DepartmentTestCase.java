package net.cnr.studentManagentBackEnd.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.cnr.studentManagentBackEnd.dao.DepartmentDao;
import net.cnr.studentManagentBackEnd.dto.Department;

public class DepartmentTestCase {
	
	private static AnnotationConfigApplicationContext context;
	
	@Autowired 
	private static DepartmentDao departmentDao;
	
	private  Department department;
	@BeforeClass
	public static void init(){
		
		context = new AnnotationConfigApplicationContext();
		context.scan("net.cnr.studentManagentBackEnd");
		context.refresh();
		departmentDao = (DepartmentDao) context.getBean("departmentDao");
		
	}
	
/*
	@Test
	public void testAddCategory() {
		department = new Department();
		department.setName("Department of Robetics");
		department.setExtension("111");
		department.setActive(true);
		
		department.setName("Department of Business");
		department.setExtension("222");
		department.setActive(true);

		assertEquals("Not successfully addes a department inside the table department", true, departmentDao.add(department));
		
	}*/
/*	
	@Test
	public void testUpdateProduct(){
		department = departmentDao.get(3);
		department.setName("Department Of Computing");
		
		assertEquals("Some thing went wrong while Updating a product",true,departmentDao.update(department));
	}
	*/
	
	/*
	@Test
	public void testDeleteDepartment(){
		department = departmentDao.get(3);
		
		
		assertEquals("Some thing went wrong while Updating a product",true,departmentDao.delete(department));
	}
	*/
	/*@Test
	public void testListDepartment(){
	
		
		
		assertEquals("Some thing went wrong while Updating a product",4,departmentDao.list().size());
	}*/
	
	
}
