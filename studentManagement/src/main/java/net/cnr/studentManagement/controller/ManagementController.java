package net.cnr.studentManagement.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.cnr.studentManagentBackEnd.dao.StudentDao;
import net.cnr.studentManagentBackEnd.dto.Student;

@Controller
@RequestMapping("/manage")
public class ManagementController {

	@Autowired
	private StudentDao studentDao;
	
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public ModelAndView showManageProduct(@RequestParam(name="operation",required=false) String operation ){
		
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("userClickManageStudent",true);
		mv.addObject("title","Manage Product");
		
		Student nstudent = new Student();
		mv.addObject("studentModel",nstudent);
		
		if(operation!=null){
			if(operation.equals("student")){
				mv.addObject("message","Student Registered Successfully!!");
			}
		}
	
		return mv;
		
	}
	
	@RequestMapping(value="/student", method=RequestMethod.POST)
	public String handleProductSubmission(@Valid @ModelAttribute("studentModel") Student mStudent,BindingResult results,Model model){
		
		//check if there are any error
		if(results.hasErrors()){
			model.addAttribute("userClickManageStudent",true);
			model.addAttribute("title","Manage Products");
			model.addAttribute("message","Validation Failed for the Submission!!!");
			return "page";
		}
		
		studentDao.add(mStudent);
		
		return "redirect:/manage/student?operation=student";
		
	}
}
