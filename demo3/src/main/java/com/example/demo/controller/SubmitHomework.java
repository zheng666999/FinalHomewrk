package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SubmitHomework{
     
	@Autowired
	StudentService ss;

    public SubmitHomework() {
        super();
    }

    @RequestMapping("submit")
	@ResponseBody
	public boolean submit(@RequestBody Student s){
		return ss.submit(s);
	}
}
