package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;


@Controller
public class IncreaseStudent {
   
	@Autowired
	TeacherService ts;
	//TeacherDao td;
	@Autowired
	Teacher t;
    public IncreaseStudent() {
        super();
    }

    @RequestMapping("increase")
	public String increase(@RequestParam("add") String sno,@RequestParam("tno") String tno){
		t.setTno(tno);
		ts.addStudent(t.getTno(), sno);
		System.out.println("��ӳɹ�");
		return "Success2";
	}
}
