package com.xworkz.managerapp.manager;

public class Manager {
  
	private String name;
	private int age;
	private String qualification;
	private long contactNo;
	
	public Manager(String name,int age,String qualification, long contactNo) {
		this.name = name;
		this.age= age;
		this.qualification = qualification;
		this.contactNo= contactNo;
	}
	
	public Manager() {
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
	return age;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getQualification() {
		return qualification;
	}
	public void getContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public long getContactNo() {
		return contactNo;
	}
}

