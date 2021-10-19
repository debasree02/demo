package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.StudentDAO;
import com.example.demo.model.Student;

@Service
public class StudentService {
	
@Autowired
	public  StudentDAO stuDao;
public Student saveStudent(Student stu) {
	return stuDao.save(stu);
	
}

public List<Student> getAllStudent(){
	return stuDao.findAll();
	
}
public Optional<Student> getStudent(Integer id){
	return stuDao.findById(id);
	
}
}
