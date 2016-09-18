package com.times.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class User {
	@Id
		public String userId;
	@Column
		public String customerName;
	@Column
		public String Mobile;
	@Column
		public String Email;
	@Column
		public String Address;
	
public User()
{
	
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getMoblie() {
	return Mobile;
}
public void setMoblie(String mobile) {
	Mobile = mobile;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}

}
