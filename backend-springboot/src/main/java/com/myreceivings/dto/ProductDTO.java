package com.myreceivings.dto;

import com.myreceivings.model.Product;

public class ProductDTO {

	private long id;

	private String name;

	private double price;

	private int amountInStock;

	// ---- Getters and Setters ---- //
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAmountInStock() {
		return amountInStock;
	}

	public void setAmountInStock(int amountInStock) {
		this.amountInStock = amountInStock;
	}
	// ---- Getters and Setters ---- //

	// ---- ValueOf ----//
	public static ProductDTO valueOf(Product product) {

		ProductDTO productDTO = new ProductDTO();

		productDTO.setAmountInStock(product.getAmountInStock());
		productDTO.setId(product.getId());
		productDTO.setName(product.getName());
		productDTO.setPrice(product.getPrice());

		return productDTO;

	}
	// ---- ValueOf ----//
}
