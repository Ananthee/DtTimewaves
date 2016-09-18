package com.times.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class RegisterDetails {
	@Id
	public String UserName;
	@Column
	public String FirstName;
	@Column
	public String LastName;
	@Column
	public String EmailId;
	@Column
	public String Address;
	@Column
	public String ContactNo;
	@Transient
	public String Password;
		
	public RegisterDetails()
	{
		
	}
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getContactNo() {
		return ContactNo;
	}
	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}
	
	}