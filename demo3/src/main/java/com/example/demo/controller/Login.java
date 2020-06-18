package com.example.demo.controller;

import java.util.List;

import com.example.demo.service.StudentService;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.entity.User;

@Controller
public class Login {


	@Autowired
	private Teacher t;
	@Autowired
	private TeacherService ts;
	@Autowired
	private Student s;
	@Autowired
	private StudentService ss;

	public Login() {

	}

	@RequestMapping("login")
	public String login(User user,Model model) {
		//context = ContextLoader.getCurrentWebApplicationContext();

		if (user.getCharacter().equals("老师")) {
			t.setTno(user.getNo());
			t.setTpassword(user.getPwd());
			if (ts.validLogin(t)) {
				Teacher temp = ts.selectByTno(t.getTno());
				List<Student> list = ts.getAllStudents(t.getTno());
				model.addAttribute("students", list);
				model.addAttribute("teacher", temp);
				return "teacher";
			} else {
				System.out.println("失败1");
				return "signIn";
			}
		} else if (user.getCharacter().equals("学生")) {

			s.setSno(user.getNo());
			s.setSpassword(user.getPwd());
			if (ss.loginValid(s)) {
				System.out.println(s.getSno());
				List<Teacher> temp = ss.getTeacherInf(s.getSno());
				s = ss.getInf(s.getSno());
				model.addAttribute("student", s);
				model.addAttribute("teachers", temp);
				return "Student";
			} else {
				System.out.println("失败2");
				return "signIn";
			}
		}
		System.out.println("用户名或密码错误");
		return "signIn";
	}

}
