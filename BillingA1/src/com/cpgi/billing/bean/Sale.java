package com.cpgi.billing.bean;

import java.time.LocalDate;

public class Sale {
	private int saleid;
	private int proCode;
	private String productName;
	private String category;
	private LocalDate saleDate;
	private int quantity;
	private float lineTotal;
	
	public Sale() {
		super();
	}
	public int getSaleid() {
		return saleid;
	}
	public void setSaleid(int saleid) {
		this.saleid = saleid;
	}
	public int getProCode() {
		return proCode;
	}
	public void setProCode(int proCode) {
		this.proCode = proCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public LocalDate getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getLineTotal() {
		return lineTotal;
	}
	public void setLineTotal(float lineTotal) {
		this.lineTotal = lineTotal;
		
	}
	public String toString() {
		return "Sale [saleid=" + saleid + ", proCode=" + proCode
				+ ", productName=" + productName + ", category=" + category
				+ ", saleDate=" + saleDate + ", quantity=" + quantity
				+ ", lineTotal=" + lineTotal + "]";
	}
	

}
