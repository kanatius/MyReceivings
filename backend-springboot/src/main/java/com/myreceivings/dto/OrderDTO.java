package com.myreceivings.dto;

import com.myreceivings.model.Order;
import com.myreceivings.model.Product;

public class OrderDTO {

	private long id;

	private Product product;

	private double priceWhenSold;

	private int amount;

	// ---- Getters and Setters ---- //
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getPriceWhenSold() {
		return priceWhenSold;
	}

	public void setPriceWhenSold(double priceWhenSold) {
		this.priceWhenSold = priceWhenSold;
	}
	// ---- Getters and Setters ---- //
	
	// ---- ValueOf ----//
	public static OrderDTO valueOf(Order order) {
		
		OrderDTO orderDTO = new OrderDTO();
		
		orderDTO.setAmount(order.getAmount());
		orderDTO.setId(order.getId());
		orderDTO.setPriceWhenSold(order.getPriceWhenSold());
		orderDTO.setProduct(order.getProduct());
		
		return orderDTO;
	}
	// ---- ValueOf ----//
		
}
