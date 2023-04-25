package com.example.dbdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbdemo.model.Student;
import com.example.dbdemo.service.StudentService;

@RestController
public class LoginController {
	
	@Autowired
    StudentService student;
	
	@GetMapping(value="/fetchstudent")
	public List<Student> getAllStudent(){
		List<Student> stud_list = student.getAllstudent();
		return stud_list;
	}
	
	@PostMapping(value="/save-student")
	public Student saveStudent(@RequestBody Student st) {
		return student.saveStudent(st);
	}
	
	@PutMapping(value="/update-student")
	public Student updateStudent(@RequestBody Student st) {
		return student.saveStudent(st);
	}
	@DeleteMapping(value="/delete-student/{id}")
	public void deleteStudent(@PathVariable int id) {
		student.deleteStudent(id);
	}
}
