package com.myreceivings.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.myreceivings.dto.ProductDTO;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private long id;

	@Column
	private String name;

	@Column
	private double price;

	@Column(name = "amount_in_stock")
	private int amountInStock;

	// --- DB control --//
	@Column(name = "created_at", nullable = false, updatable = false)
	private LocalDate createdAt;

	@Column(name = "updated_at")
	private LocalDate updatedAt;
	// --- DB control --//

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

	// --- DB control --//
	public void setCreatedAt(LocalDate date) {
		this.createdAt = date;
	}

	public void setUpdatedAt(LocalDate date) {
		this.updatedAt = date;
	}
	// --- DB control --//

	// ---- ValueOf ----//
	public static Product valueOf(ProductDTO productDTO) {

		Product product = new Product();

		product.setAmountInStock(productDTO.getAmountInStock());
		product.setId(productDTO.getId());
		product.setName(productDTO.getName());
		product.setPrice(productDTO.getPrice());

		return product;

	}
	// ---- ValueOf ----//
}
