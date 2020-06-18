package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LaunchHomework {

	@Autowired
	TeacherService ts;
	//TeacherDao sd;
//	@Autowired
//	Teacher t ;
    public LaunchHomework() {
        super();
    }

    @RequestMapping("launch")
	@ResponseBody
	public String launch(@RequestBody Teacher t){
		System.out.print(t.tno);
		System.out.print(t.homework);
//		t.setTno(t.tno);
//		t.setHomework(t.homework);
		return ts.launchHomework(t);
	}

}
