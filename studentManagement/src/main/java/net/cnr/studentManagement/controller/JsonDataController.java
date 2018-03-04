package net.cnr.studentManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.cnr.studentManagentBackEnd.dao.TeacherDao;
import net.cnr.studentManagentBackEnd.dto.Teacher;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {

	@Autowired
	private TeacherDao teacherDao;
	
	@RequestMapping("/all/teachers")
	@ResponseBody
	public List<Teacher>getAllTeachers(){
		
		return teacherDao.listActiveTeachers();
	}

	@RequestMapping("admin/all/teachers")
	@ResponseBody
	public List<Teacher>getAllTeachersForAdmin(){
		
		return teacherDao.list();
	}
	
	@RequestMapping("/department/{id}/teacher")
	@ResponseBody
	public List<Teacher>getProductByCategory(@PathVariable int id){
		
		return teacherDao.listActiveTeachersByDepartmentId(id);
	}
}
