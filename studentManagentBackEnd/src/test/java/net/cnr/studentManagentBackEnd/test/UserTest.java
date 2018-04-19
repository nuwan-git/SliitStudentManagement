package net.cnr.studentManagentBackEnd.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.cnr.studentManagentBackEnd.dao.UserDao;
import net.cnr.studentManagentBackEnd.dto.Address;
import net.cnr.studentManagentBackEnd.dto.User;

public class UserTest {

	private static AnnotationConfigApplicationContext context;
	private static UserDao userDao;
	private User user = null;
	private Address address = null;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.cnr.studentManagentBackEnd");
		context.refresh();

		userDao = (UserDao) context.getBean("userDao");
	}
	
	@Test
	public void testAdd(){
		 user = new User(); 
		 
		  user.setFirstName("Mahela");
		  user.setLastName("Jayawardhana"); 
		  user.setEmail("mahela@gmail.com");
		  user.setContactNumber("1231231234"); 
		  user.setRole("Student");
		  user.setPassword("123456");
		  
		 
		  assertEquals("Failed add the user",true,userDao.addUser(user));
		  address = new Address();
		  
		  address.setUser(user);
		  address.setAddressLineOne("101/8 colombo Nugegoda,Krish Nago");
		  address.setAddresssLineTwo("Near Orange Color bulding");
		  address.setCity("Nawala");
		  address.setState("Colombo");
		  address.setCountry("Srilanka"); 
		  address.setPostalCode("60650");
		  
		  if(user.getRole().equals("Student")){
			  address.setStudent(true);
		  }
		  else if(user.getRole().equals("Teacher")){
			  address.setTeacher(true);
		  }
		  
		  assertEquals("Failed add the address",true,userDao.addAddress(address));
	}

}
