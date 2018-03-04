package net.cnr.studentManagentBackEnd.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.cnr.studentManagentBackEnd.dao.StudentDao;
import net.cnr.studentManagentBackEnd.dto.Student;

public class StudentTestCase {

	private static AnnotationConfigApplicationContext context;
	
	@Autowired
	private static StudentDao studentDao;
	
	private Student student;
	@BeforeClass
	public static void init(){
		
		context = new AnnotationConfigApplicationContext();
		context.scan("net.cnr.studentManagentBackEnd");
		context.refresh();
		studentDao = (StudentDao) context.getBean("studentDao");
		
	}
	
	@Test
	public void testAddCategory() {
		student = new Student();
		student.setName("kamal");
		student.setEmail("kamal@gmail.com");
		student.setAddress("kurunegala");
		student.setPhoneNumber("0112343222");
		
		

		assertEquals("Not successfully addes a student inside the table student", true, studentDao.add(student));
	}
	
	/*@Test
	public void testGetProduct(){
		student = studentDao.get(3);
		
		assertEquals("Some thing went wrong while fetches a single product from the table", "kamal",student.getName());
	}
	*/
	/*@Test
	public void testUpdateProduct(){
		student =studentDao.get(3);
		student.setName("sanga");
		
		assertEquals("Some thing went wrong while Updating a product",true,studentDao.update(student));
	}
	*/
}
