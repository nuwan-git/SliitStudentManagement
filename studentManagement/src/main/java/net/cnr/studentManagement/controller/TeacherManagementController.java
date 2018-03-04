package net.cnr.studentManagement.controller;

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

import net.cnr.studentManagentBackEnd.dao.TeacherDao;
import net.cnr.studentManagentBackEnd.dto.Teacher;

@Controller
@RequestMapping("/teacher")
public class TeacherManagementController {

	@Autowired
	private TeacherDao teacherDao;
	
	private static Teacher teacher;
	
	@RequestMapping(value="/manage",method=RequestMethod.GET)
	public ModelAndView showManageTeachers(@RequestParam(name="operation",required=false) String operation ){
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("userClickManageTeachers",true);
		mv.addObject("title","Manage Teachers");
		
		Teacher nTeacher = new Teacher();
		nTeacher.setActive(true);
		mv.addObject("teacherModel",nTeacher);//link with teacherModel with spring form
		
		if(operation!=null){
			if(operation.equals("teacher")){
				mv.addObject("message","Teacher Registered Successfully!!");
			}
			else if(operation.equals("uTeacher")){
				mv.addObject("message","Teacher Updated Successfully!!");
			}
			
		}
		
		return mv;
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String handleTeacherRegistraion( @ModelAttribute("teacherModel") Teacher mTeacher,BindingResult result,Model model){
		
		
		
		teacherDao.add(mTeacher);
		
		return "redirect:/teacher/manage?operation=teacher";
	}
	
	
	
	@RequestMapping(value="/{id}/details",method=RequestMethod.GET)
	public ModelAndView showManageProduct(@PathVariable int id){
		
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("userClickManageTeachers",true);
		mv.addObject("title","Manage Teachers");
		
		Teacher nTeacher =teacherDao.get(id);
		
		
		mv.addObject("teacherModel",nTeacher);
		
		
		return mv;
		
	}
	@RequestMapping(value="/{id}/update",method=RequestMethod.GET)
	public String updateTeacherDetails(@PathVariable int id,@ModelAttribute("teacherModel") Teacher mTeacher,BindingResult result,Model model){
		
		teacher = teacherDao.get(id);
		
		
		
		System.out.println("name"+mTeacher.getName());
		System.out.println("Experience years "+mTeacher.getExperienceYears());
		System.out.println("Dep Id "+mTeacher.getDepartmentId());
		
		teacherDao.update(mTeacher);
		
		return "redirect:/teacher/manage?operation=uTeacher";
		
	}
		
	
}
