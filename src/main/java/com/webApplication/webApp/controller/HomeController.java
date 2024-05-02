package com.webApplication.webApp.controller;


import com.webApplication.webApp.StudentRepo;
import com.webApplication.webApp.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@Autowired
	StudentRepo repo;
	@RequestMapping("/home")
	public String Home() {
		return "home";
	}
	@RequestMapping("/addStudent")
	public String addStudent( Student student){
		repo.save(student);

		return "home";
	}
}
