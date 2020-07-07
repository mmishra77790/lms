package com.lms.service;

import java.util.List;

import com.lms.model.CoursePriceDetails;
import com.lms.model.Student;

public interface CommonService {
	
	public List<Student> getAllStudents();
	public Student getStudentById(long id);
	public CoursePriceDetails getPriceCourseById(int courseId, int countryId);
	
}
