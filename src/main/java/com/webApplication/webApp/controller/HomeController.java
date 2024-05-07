package com.webApplication.webApp.controller;


import com.webApplication.webApp.StudentRepo;
import com.webApplication.webApp.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
public class HomeController {
	@Autowired
	StudentRepo repo;
	@GetMapping("/studentForm")
	public String studentForm() {
		return "studentForm";
	}
	@GetMapping("/searchStudentInfo")
	public String searchStudentInfo() {
		return "searchStudentInfo";
	}

	@GetMapping("/getStudents")
	public List<Student> getStudents(){
		return repo.findAll();

	}
	@GetMapping("/getStudent/{id}")
	public Optional<Student> getStudentById(@PathVariable int id){
		return repo.findById(id);
	}
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student){
		repo.save(student);
		return student;
	}
	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student student){
		repo.save(student);
		return student;
	}
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id){
		Student student=repo.findById(id).orElse(null);
		repo.delete(student);
		return "Deleted";
	}

//	@GetMapping("/getStudent")
//	public ModelAndView getStudent(@RequestParam int id){
//		ModelAndView mv=new ModelAndView();
//		Student student=repo.findById(id).orElse(new Student());
//		mv.addObject("student", student);
//		mv.setViewName("studentInfo");
//		return mv;
//	}

}
