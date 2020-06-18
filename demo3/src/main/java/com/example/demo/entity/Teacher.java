package com.example.demo.entity;

import org.springframework.stereotype.Component;

@Component(value="teacher")
public class Teacher {

	public String tno;
	public String tpassword;
	public String tname;
	public String homework;
	
	public Teacher() {
		super();

	}
	
	public Teacher(String tno,String tpassword) {
		this.tno = tno;
		this.tpassword = tpassword;
	}
	
	public String getTpassword() {
		return tpassword;
	}
	public void setTpassword(String tpassword) {
		this.tpassword = tpassword;
	}
	public String getTno() {
		return tno;
	}
	public void setTno(String tno) {
		this.tno = tno;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getHomework() {
		return homework;
	}
	public void setHomework(String homework) {
		this.homework = homework;
	}
	public String toString() {
		return this.tno+" "+this.tname+" "+this.homework;
	}
}
