package com.lms.model;

public class Tax {
	
	private int id;
	private String name;
	private String code;
	private String description;
	private int countryCode;
	private int percentage;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
	@Override
	public String toString() {
		return "Tax [id=" + id + ", name=" + name + ", code=" + code + ", description=" + description + ", countryCode="
				+ countryCode + ", percentage=" + percentage + "]";
	}
}
