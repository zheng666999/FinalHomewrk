package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;

@Mapper
public interface StudentDao {

	public boolean updateHomework(@Param("sno") String sno,@Param("shomework") String shomework);

	public Student selectBySno(@Param("sno") String sno) ;
	
	public String checkHomework(@Param("sno") String sno,@Param("tno") String tno) ;

	public int insertStudent(Student s) ;

	public int selectForValid(Student s);

	public int selectNum(@Param("sno")  String sno);

	public List<Teacher> selectTeacher(@Param("sno") String sno,@Param("count") int count) ;
}

