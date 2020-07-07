package com.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.lms.config.AppConfiguration;
import com.lms.model.Country;
import com.lms.model.Course;
import com.lms.model.CoursePriceDetails;
import com.lms.model.CourseType;
import com.lms.model.Student;
import com.lms.model.Tax;
import com.lms.service.CommonService;
import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api")
@Api(value = "Its for LMS APi's", description = "Its for LMS APi's, which return student related info")
public class CommonRestController {
	
	@Autowired
	private CommonService commonService;
	
	@Autowired
	private AppConfiguration appConfig;
	
	@RequestMapping(path="/students", method=RequestMethod.GET)
	public List<Student> getAllStudents(){
		return commonService.getAllStudents();
	}
    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") long id){
		return commonService.getStudentById(id);
	}
    
    @RequestMapping(path="/courseTypes", method=RequestMethod.GET)
	public List<CourseType> getCourseTypes(){
		return appConfig.getCourseTypes();
	}
    
    @RequestMapping(path="/course", method=RequestMethod.GET)
	public List<Course> getCourse(){
		return appConfig.getCourses();
	}
    
    @RequestMapping(path="/course/{id}", method=RequestMethod.GET)
	public Course getCourseById(@PathVariable("id") int id){
		return appConfig.getCourses().get(id);
	}
    
    @RequestMapping(path="/tax", method=RequestMethod.GET)
	public List<Tax> getTax(){
		return appConfig.getTax();
	}
    
    @RequestMapping(path="/country", method=RequestMethod.GET)
	public List<Country> getCountry(){
		return appConfig.getCountries();
	}
    
    @RequestMapping(path="/course/{courseId}/country/{countryId}", method=RequestMethod.GET)
	public CoursePriceDetails getPriceCourseById(@PathVariable("courseId") int courseId, @PathVariable("countryId") int countryId){
		return commonService.getPriceCourseById(courseId, countryId);
	}

}
