package com.example.demo.entity;

import org.springframework.stereotype.Component;

@Component(value="user")
public class User {

	public String no;
	public String pwd;
	public String name;
	public String character;
	
	public User() {
		super();
	}
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getCharacter() {
		return character;
	}
	public void setCharacter(String character) {
		this.character = character;
	}
	
	public String toString() {
		return this.no+this.character;
	}
}
