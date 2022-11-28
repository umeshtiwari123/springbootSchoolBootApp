package com.ty.schoolapp.schoolboot_src.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.schoolapp.schoolboot.src.jparepository.StudentRepo;
import com.ty.schoolapp.schoolboot_src.dto.Student;

@Repository
public class StudentDao {

	@Autowired
	StudentRepo repo;
	
	
	public Student saveStudent(Student student )
	{
		return repo.save(student);
	}
	
	public Student getStudentById(int id)
	{
		return repo.findById(id).get();
	}
}
