package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	JdbcTemplate template;
	
	@Override
	public int save(Student s) {
		String sql = "insert into studentdata values('"+s.getSname()+"','"+s.getRollno()+"','"+s.getCourse()+"')";
		return template.update(sql);
	}

	@Override
	public List<Student> read() {
		return template.query("select * from studentdata", new RowMapper<Student>() {
			public Student mapRow(ResultSet rs, int row) throws SQLException {
				Student s = new Student();
				s.setSname(rs.getString(1));
				s.setRollno(rs.getString(2));
				s.setCourse(rs.getString(3));
				return s;
			}
		});
	}

	@Override
	public int delete(Student s) {
		String sql = "delete from studentdata where rollno = '"+s.getRollno()+"'";
		return template.update(sql);
	}

}
