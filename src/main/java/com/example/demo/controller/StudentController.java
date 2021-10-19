package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
@Autowired
	public StudentService stuService;
@Autowired
private RestTemplate rt;
@PostMapping("/saveStudent")
public Student saveStudent(@RequestBody Student stu) {
	return stuService.saveStudent(stu);
}

@GetMapping("/getAllStudent")
public List<Student> getAllStudent() {
	return stuService.getAllStudent();
}

@GetMapping("/getStudent/{id}")
public Optional<Student> getStudent(@PathVariable Integer id) {
	return stuService.getStudent(id);
}
@GetMapping("/Hello")
public String Hello() {
	String a=rt.getForObject("http://localhost:9082/api/show",String.class);
	return a;
}
}
