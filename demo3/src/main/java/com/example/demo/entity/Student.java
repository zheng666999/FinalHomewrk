package com.example.demo.entity;

import org.springframework.stereotype.Component;

@Component()
public class Student {
	public String sno;
	public String sname;
	public String shomework;
	public String spassword;

	public Student() {
	}

	public Student(String sno, String name, String shomework, String spassword) {
		super();
		this.sno = sno;
		this.sname = name;
		this.shomework = shomework;
		this.spassword = spassword;
	}

	public Student(String sno, String spassword) {
		this.sno = sno;
		this.spassword = spassword;
	}

	public String getSpassword() {
		return spassword;
	}

	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getName() {
		return sname;
	}

	public void setName(String name) {
		this.sname = name;
	}

	public String getShomework() {
		return shomework;
	}

	public void setShomework(String shomework) {
		this.shomework = shomework;
	}

	public String toString() {
		return this.sno + " " + this.sname + " " +  this.shomework;
	}
}
