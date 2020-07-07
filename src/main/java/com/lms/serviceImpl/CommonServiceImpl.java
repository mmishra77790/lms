package com.lms.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.config.AppConfiguration;
import com.lms.model.Course;
import com.lms.model.CoursePriceDetails;
import com.lms.model.Student;
import com.lms.model.Tax;
import com.lms.repository.StudentRepository;
import com.lms.service.CommonService;
import com.lms.util.Common;

@Service("commonService")
public class CommonServiceImpl implements CommonService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private AppConfiguration appConfig;

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(long id) {
		return studentRepository.findOne(id);
	}

	@Override
	public CoursePriceDetails getPriceCourseById(int courseId, int countryId) {
		CoursePriceDetails coursePriceDetails = new CoursePriceDetails();
		coursePriceDetails.setCourse(appConfig.getCourses().get(courseId));
		int courseAmount = appConfig.getCourses().get(courseId).getAmount();
		int totalTaxes = 0;
		coursePriceDetails.setCountry(appConfig.getCountries().get(countryId));
		List<Tax> taxList = new ArrayList<Tax>();
		List<String> taxes = new ArrayList<String>();
		taxes.add("Course Amount : "+courseAmount);
		for(int i=0;i<appConfig.getTax().size();i++) {
			if(appConfig.getTax().get(i).getCountryCode() == countryId) {
				taxList.add(appConfig.getTax().get(i));
				int taxAmount = (courseAmount/100) * appConfig.getTax().get(i).getPercentage();
				courseAmount = courseAmount + taxAmount;
				totalTaxes = totalTaxes + taxAmount;
				taxes.add(appConfig.getTax().get(i).getName() + " is "+appConfig.getTax().get(i).getPercentage() + "% : "+taxAmount);
			}
		}
		taxes.add("Total Taxes : "+totalTaxes);
		taxes.add("Total Course Charges : "+courseAmount);
		coursePriceDetails.setTax(taxList);
		coursePriceDetails.setCharges(taxes);
		return coursePriceDetails;
	}

}
