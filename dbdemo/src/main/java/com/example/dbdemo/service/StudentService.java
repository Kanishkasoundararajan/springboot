package com.example.dbdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dbdemo.model.Student;
import com.example.dbdemo.repository.StudentRepository;
@Service
public class StudentService {

	@Autowired
	StudentRepository studentrepository;
	
	public List<Student> getAllstudent() {
		List<Student> abc = studentrepository.findAll();
		return abc;
	}
	
	
	public Student saveStudent(Student s) {
		
		return studentrepository.save(s);
	}
	public void deleteStudent(int s) {
		studentrepository.deleteById(s);
	}

}
