package com.ty.schoolapp.schoolboot_src.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.schoolapp.schoolboot_src.dao.StudentDao;
import com.ty.schoolapp.schoolboot_src.dto.Student;

@RestController
public class StudentController {

	@Autowired
	StudentDao dao;
	
	@PostMapping("save")
	public Student saveStudent(@RequestBody Student student)
	{
		return dao.saveStudent(student);
	}
	
	@GetMapping("get")
	public Student getStudent(@RequestParam int id)
	{
		return dao.getStudentById(id);
	}
}
