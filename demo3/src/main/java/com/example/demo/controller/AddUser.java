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
public class AddUser {


    @Autowired
    private Teacher t;
    @Autowired
    private TeacherService ts;
    @Autowired
    private Student s;
    @Autowired
    private StudentService ss;

    public AddUser() {

    }

    @RequestMapping("signUp")
    public String login(User user) {

        if (user.getCharacter().equals("老师")) {
            t.setTno(user.no);
            t.setTname(user.name);
            t.setTpassword(user.pwd);
            if (ts.insertTeacher(t)) {
                return "signIn";
            } else {
                System.out.println("失败1");
                return "signUp";
            }
        } else if (user.getCharacter().equals("学生")) {
            s.setSno(user.no);
            s.setName(user.name);
            s.setSpassword(user.pwd);
            if (ss.addStudent(s)) {
                System.out.println(s.getSno());
                return "signIn";
            } else {
                System.out.println("失败2");
                return "signUp";
            }
        }
        System.out.println("用户已存在");
        return "signUp";
    }

}

