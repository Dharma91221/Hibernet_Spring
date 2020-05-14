package com.beanFac;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
public class Employee {
	
	private Integer empId;
	private String name;
	private String[] hobbies;
	private ArrayList<String> email;
	private HashSet<String> phn;
	private HashMap<String,String> education;
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public ArrayList<String> getEmail() {
		return email;
	}
	public void setEmail(ArrayList<String> email) {
		this.email = email;
	}
	public HashSet<String> getPhn() {
		return phn;
	}
	public void setPhn(HashSet<String> phn) {
		this.phn = phn;
	}
	public HashMap<String, String> getEducation() {
		return education;
	}
	public void setEducation(HashMap<String, String> education) {
		this.education = education;
	}
	
	
	
	
	
	
}
