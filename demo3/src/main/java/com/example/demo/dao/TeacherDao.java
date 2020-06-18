package com.example.demo.dao;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.example.demo.entity.*;
import com.example.demo.entity.Student;

@Mapper
public interface TeacherDao {

	public int updateHomework(Teacher t);

	public int insertStudent(@Param("tno")  String tno,@Param("sno")  String sno);

	public Teacher selectByTno(@Param("tno")  String tno) ;

	public int insertTeacher(Teacher t) ;

	public int selectNum(@Param("tno")  String tno) ;

	public List<Student> getAllStudents(@Param("tno")  String tno,@Param("count")  int count) ;
}

