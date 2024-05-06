package com.webApplication.webApp.controller;


import com.webApplication.webApp.StudentRepo;
import com.webApplication.webApp.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class HomeController {
	@Autowired
	StudentRepo repo;
	@RequestMapping("/studentForm")
	public String studentForm() {
		return "studentForm";
	}
	@RequestMapping("/searchStudentInfo")
	public String searchStudentInfo() {
		return "searchStudentInfo";
	}
	@RequestMapping("/addStudent")
	public String addStudent( Student student){
		repo.save(student);
		return "studentForm";
	}
	@RequestMapping("/getStudent")
	public ModelAndView getStudent(@RequestParam int id){
		ModelAndView mv=new ModelAndView();
		Student student=repo.findById(id).orElse(new Student());
		mv.addObject("student", student);
		mv.setViewName("studentInfo");
		return mv;
	}
}
