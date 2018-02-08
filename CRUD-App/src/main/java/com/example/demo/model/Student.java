package com.example.demo.model;

public class Student {
	private String sname;
	private String rollno;
	private String course;
	public Student() {
		
	}
	public Student(String sname, String rollno, String course) {
		super();
		this.sname = sname;
		this.rollno = rollno;
		this.course = course;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}
