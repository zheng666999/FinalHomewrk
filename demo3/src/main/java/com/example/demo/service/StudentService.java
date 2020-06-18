package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;

@Service
public class StudentService {

	@Resource
	StudentDao sd;

	public StudentService() {
	}

	public boolean submit(Student s) {
		return sd.updateHomework(s.getSno(), s.getShomework());
	}

	public boolean isExists(String sno) {
		if (sd.selectBySno(sno) != null) {
			return true;
		}
		return false;
	}
	public boolean addStudent(Student s) {
		if (!isExists(s.getSno())) {
			sd.insertStudent(s);
			return true;
		}
		return false;
	}

	public boolean loginValid(Student s) {
		if (isExists(s.getSno())) {
			System.out.println(sd.selectForValid(s));
			int temp= sd.selectForValid(s);
			if(temp==1) {
				return true;
			}
		}
		return false;
	}

	public Student getInf(String sno) {
		return sd.selectBySno(sno);
	}

	public List<Teacher> getTeacherInf(String sno) {
		return sd.selectTeacher(sno, sd.selectNum(sno));
	}
}
