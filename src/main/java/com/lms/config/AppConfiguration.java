package com.lms.config;


import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.lms.model.Country;
import com.lms.model.Course;
import com.lms.model.CourseType;
import com.lms.model.Tax;

@ConfigurationProperties(prefix = "app")
@Configuration
@EnableConfigurationProperties
public class AppConfiguration { 
	
	private List<CourseType> courseTypes;
	private List<Course> courses;
	private List<Tax> tax;
	private List<Country> countries;
	
	public List<CourseType> getCourseTypes() {
		return courseTypes;
	}
	public void setCourseTypes(List<CourseType> courseTypes) {
		this.courseTypes = courseTypes;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	public List<Tax> getTax() {
		return tax;
	}
	public void setTax(List<Tax> tax) {
		this.tax = tax;
	}
	public List<Country> getCountries() {
		return countries;
	}
	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}
	
	@Override
	public String toString() {
		return "AppConfiguration [courseTypes=" + courseTypes + ", courses=" + courses + ", tax=" + tax + ", countries="
				+ countries + "]";
	}
}
