package net.cnr.studentManagentBackEnd.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.cnr.studentManagentBackEnd.dao.TeacherDao;
import net.cnr.studentManagentBackEnd.dto.Teacher;

public class TeacherTestCase {

private static AnnotationConfigApplicationContext context;
	
	@Autowired 
	private static TeacherDao teacherDao;
	
	private  Teacher teacher;
	@BeforeClass
	public static void init(){
		
		context = new AnnotationConfigApplicationContext();
		context.scan("net.cnr.studentManagentBackEnd");
		context.refresh();
		teacherDao = (TeacherDao) context.getBean("teacherDao");
		
	}
	/*
	@Test
	public void testAddTeachers() {
		teacher = new Teacher();
		
		teacher.setName("Dulipa");
		teacher.setEmail("Dulipa@gmail.com");
		teacher.setExperienceYears(1);
		teacher.setEducation("Ananda College");
		teacher.setDepartmentId(4);
		teacher.setActive(false);
		
		

		assertEquals("Not successfully addes a teacher inside the table teacher", true, teacherDao.add(teacher));
		
	}*/
	/*@Test
	public void testActiveTeachers() {
		teacher = new Teacher();
		assertEquals("Not successfully addes a teacher inside the table teacher", 3, teacherDao.listActiveTeachers().size());
		
	}*/
	/*@Test
	public void testlistActiveTeachersByExperienceYears(){
		assertEquals("Not successfully addes a teacher inside the table teacher", 2, teacherDao.listActiveTeachersByExperienceYears(1).size());
	}*/
	/*@Test
	public void testlistActiveTeachersByDepartmentId(){
		assertEquals("Not successfully addes a teacher inside the table teacher", 1, teacherDao.listActiveTeachersByDepartmentId(2).size());
	}*/
}
