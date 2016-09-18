package com.times.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;	

@Entity

public class Product {
	@Id
	@Column
		public String productId;
	@Column
		public String productName;
	@Column
		public String supplierId;
	@Column
		public int quantity;
	@Column
		public int price;
	@Column
		public String description;
	@Column
		public String categoryId;
			
	@Transient
	MultipartFile pimage;
		

public Product()
{
	
}

public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getSupplierId() {
	return supplierId;
}

public void setSupplierId(String supplierId) {
	this.supplierId = supplierId;
}

public String getCategoryId() {
	return categoryId;
}

public void setCategoryId(String categoryId) {
	this.categoryId = categoryId;
}


public MultipartFile getPimage() {
	return pimage;
}

public void setPimage(MultipartFile pimage) {
	this.pimage = pimage;
}

}
