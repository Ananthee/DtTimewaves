package com.times.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Product {
	@Id
	@Column
		public String productId;
	@Column
		public String productName;
	@Column
		public String sellerId;
	@Column
		public int quantity;
	@Column
		public int price;
	@Column
		public String description;
	@Column
		public String categoryId;
public Product()
{
	
}

public Product(String productId, String productName, String sellerId, int quantity, int price, String description,
		String categoryId) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.sellerId = sellerId;
	this.quantity = quantity;
	this.price = price;
	this.description = description;
	this.categoryId = categoryId;
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
public String getSellerId() {
	return sellerId;
}
public void setSellerId(String sellerId) {
	this.sellerId = sellerId;
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
public String getCategory() {
	return categoryId;
}
public void setCategory(String categoryId) {
	this.categoryId = categoryId;
}

}
