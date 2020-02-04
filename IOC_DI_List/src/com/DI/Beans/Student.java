package com.DI.Beans;

public class Student {

	private Teacher teacher;
	private String standard;
	private String marks;
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	} 
	
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public void display()
	{
		System.out.println("Teacher name "+teacher.getName());
		System.out.println("Student Standard"+standard+"marks "+marks);
		
	}
}
