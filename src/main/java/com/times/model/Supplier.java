package com.times.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class Supplier {
	@Id
	@Column
		public String supplierId;
	@Column
		public String supplierName;
	@Column
		public String supplierAddress;
	public Supplier()
	{
		
	}
	
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierAddress() {
		return supplierAddress;
	}
	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

}
