package com.cg.billinga2new.bean;

public class Product {

	private int productId;
	private String productName;
	private String productCat;
	private int productPrice;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(int productId, String productName, String productCat,
			int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCat = productCat;
		this.productPrice = productPrice;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductCat() {
		return productCat;
	}


	public void setProductCat(String productCat) {
		this.productCat = productCat;
	}


	public int getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}


	public String toString() {
		return "Product [productId=" + productId + ", productName="
				+ productName + ", productCat=" + productCat
				+ ", productPrice=" + productPrice + "]";
	}

	
}
