package com.ty.schoolapp.schoolboot.src.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.schoolapp.schoolboot_src.dto.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
