package com.hamitm.behavioral.mediator;

public class Student {
	
	private String studentName;

	//parametreli constructor
	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}
	
	//getter and setter
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void mesajGonder(String mesaj) {
		Mediator.mesajGoster(this, mesaj);
	}
	
	
	
	
}
