package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {

	public int save(Student s);
	
	public List<Student> read();
	
	public int delete(Student s);
	
}
