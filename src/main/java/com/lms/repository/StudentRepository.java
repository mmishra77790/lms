package com.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.model.Student;

@Repository("studentRepository")
public interface StudentRepository extends JpaRepository<Student, Long>{

}
