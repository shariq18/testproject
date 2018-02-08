package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentDao {
	public int save(Student s);
	public List<Student> read();
	public int delete(Student s);
}
