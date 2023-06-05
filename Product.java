package com.practice.collection;

public class Product {
	private String productId;
	private String productName;

	public Product(String productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;	
		
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}

	public String getProductId() {
		return productId;
	}


	public String getProductName() {
		return productName;
	}
	
}
