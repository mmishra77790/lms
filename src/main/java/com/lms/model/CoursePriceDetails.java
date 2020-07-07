package com.lms.model;

import java.util.List;

public class CoursePriceDetails {
	
	private Course course;
	private Country country;
	private List<Tax> tax;
	private List<String> charges;
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public List<Tax> getTax() {
		return tax;
	}
	public void setTax(List<Tax> tax) {
		this.tax = tax;
	}
	public List<String> getCharges() {
		return charges;
	}
	public void setCharges(List<String> charges) {
		this.charges = charges;
	}

	
	
}
