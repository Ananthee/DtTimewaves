package com.times.model;


public class Cart {

	private String productId;
	private String productName;
	private int quantity=1;
	private int price;
	private int total;
	public Cart(String productId, String productName, int quantity, int price, int total) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.total = total;
	}
	public Cart()
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
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
	
	
}
