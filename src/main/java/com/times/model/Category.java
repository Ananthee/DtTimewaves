package com.times.model;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Category {
	@Id
		private String categoryId;
	@Column
		private String categoryName;
	@Column
		private String categoryDesc;
	

public Category()
{
	
}

public String getCategoryId() {
	return categoryId;
}
public void setCategoryId(String categoryId) {
	this.categoryId = categoryId;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public String getCategoryDesc() {
	return categoryDesc;
}
public void setCategoryDesc(String categoryDesc) {
	this.categoryDesc = categoryDesc;
}

}
