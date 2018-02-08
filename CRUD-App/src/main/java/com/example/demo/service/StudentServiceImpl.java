package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;

@Service("studentservicecals")
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDao studentDao;
	
	@Override
	public int save(Student s) {
		return studentDao.save(s);
	}

	@Override
	public List<Student> read() {
		return studentDao.read();
	}

	@Override
	public int delete(Student s) {
		return studentDao.delete(s);
	}

}
