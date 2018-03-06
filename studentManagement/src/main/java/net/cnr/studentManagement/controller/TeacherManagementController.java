package net.cnr.studentManagement.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.cnr.studentManagentBackEnd.dao.DepartmentDao;
import net.cnr.studentManagentBackEnd.dao.TeacherDao;
import net.cnr.studentManagentBackEnd.dto.Department;
import net.cnr.studentManagentBackEnd.dto.Teacher;

@Controller
@RequestMapping("/teacher")
public class TeacherManagementController {

	@Autowired
	private TeacherDao teacherDao;
	
	@Autowired
	private DepartmentDao departmentDao;
	
	private static Teacher teacher;
	
	@RequestMapping(value="/manage",method=RequestMethod.GET)
	public ModelAndView showManageTeachers(@RequestParam(name="operation",required=false) String operation ){
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("userClickManageTeachers",true);
		mv.addObject("title","Manage Teachers");
		
		Teacher nTeacher = new Teacher();
		nTeacher.setActive(true);
		mv.addObject("teacherModel" ,nTeacher);//link with teacherModel with spring form
		
		if(operation!=null){
			if(operation.equals("teacher")){
				mv.addObject("message","Teacher Registered Successfully!!");
			}
			else if(operation.equals("uTeacher")){
				mv.addObject("message","Teacher Updated Successfully!!");
			}
			else if(operation.equals("department")){
				mv.addObject("message","Department Submited Successfully!!");
			}
				
		}
		
		return mv;
	}
	
	//capable only handle new product
	@RequestMapping(value="/manage", method=RequestMethod.POST)
	public String handleTeacherRegistraion(@Valid @ModelAttribute("teacherModel") Teacher mTeacher , BindingResult result , Model model){
		
		
		
		
		
		if(mTeacher.getId()==0){
			teacherDao.add(mTeacher);
			System.out.println("Save Operation");
			return "redirect:/teacher/manage?operation=teacher";
		}else{
			teacherDao.update(mTeacher);
			System.out.println("Update Operation");
			return "redirect:/teacher/manage?operation=uTeacher";
		}
		
		
		
		
	}
	
	
	
	@RequestMapping(value="/{id}/details",method=RequestMethod.GET)
	public ModelAndView showManageProduct(@PathVariable int id){
		
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("userClickManageTeachers",true);
		mv.addObject("title","Manage Teachers");
		
		Teacher nTeacher =teacherDao.get(id);
		
		
		mv.addObject("teacherModel" , nTeacher);
		
		
		return mv;
		
	}
	
	@ModelAttribute("department")
	public Department getDepartment() {

		return new Department();
	}
	
	// handle departmentSubmission
		@RequestMapping(value = "/department/manage", method = RequestMethod.POST)
		public String handleCategorySubmission(@ModelAttribute Department department) {
			departmentDao.add(department);
			return "redirect:/teacher/manage?operation=department";
		}
		
		
		//return departments for all the request mapping
		@ModelAttribute("departments")
		public List<Department> getDepartments(){
			
			return departmentDao.list();
		}

		
	/*@RequestMapping(value="/{id}/update",method=RequestMethod.POST)
	public String updateTeacherDetails(@PathVariable int id,@ModelAttribute("teacherModel") Teacher mTeacher,BindingResult result,Model model){
		
		teacher = teacherDao.get(id);
		
		
		
		System.out.println("name"+mTeacher.getName());
		System.out.println("Experience years "+mTeacher.getExperienceYears());
		System.out.println("Dep Id "+mTeacher.getDepartmentId());
		
		teacherDao.update(mTeacher);
		
		return "redirect:/teacher/manage?operation=uTeacher";
		
	}*/
	


		
	
}
