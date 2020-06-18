package com.example.demo.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.dao.TeacherDao;

@Service
public class TeacherService {

	@Resource
	private TeacherDao td;

	public TeacherService() {
	}

	public boolean isExists(String tno) {
		if (td.selectByTno(tno) != null) {
			return true;
		}
		return false;
	}

	public boolean insertTeacher(Teacher t){
		if(td.insertTeacher(t)>0) {
			return true;}
		return false;
	}

	public boolean addStudent(String tno, String sno) {
		if(td.insertStudent(tno, sno)>0) {
		return true;}
		return false;
	}

	public String launchHomework(Teacher t) {
		if(td.updateHomework(t)>0) {
			return "1";}
			return "0";
	}

	public Teacher selectByTno(String tno) {
		return td.selectByTno(tno);
	}

	public boolean validLogin(Teacher t) {
		Teacher temp = selectByTno(t.getTno());
		if (temp.getTpassword().equals(t.getTpassword())) {
			return true;
		}
		return false;
	}

	public List<Student> getAllStudents(String tno) {
		return td.getAllStudents(tno, td.selectNum(tno));
	}
}
