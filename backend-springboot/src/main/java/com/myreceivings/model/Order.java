package com.myreceivings.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import com.myreceivings.dto.OrderDTO;

@Entity
public class Order {

	@Id
	@GeneratedValue
	private long id;

	@OneToOne
	private Product product;

	@Column
	private double priceWhenSold;

	@Column
	private int amount;

	// --- DB control --//
	@Column(name = "created_at", nullable = false, updatable = false)
	private LocalDate createdAt;

	@Column(name = "updated_at")
	private LocalDate updatedAt;
	// --- DB control --//

	// ---- Custom methods ---- //
	public double getTotalWhenSold() {
		return this.amount * this.priceWhenSold;
	}

	public double getTotalNow() {
		return this.product.getPrice() * this.amount;
	}
	// ---- Custom methods ---- //

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

	// --- DB control --//
	public void setCreatedAt(LocalDate date) {
		this.createdAt = date;
	}

	public void setUpdatedAt(LocalDate date) {
		this.updatedAt = date;
	}
	// --- DB control --//

	// ---- ValueOf ----//
	public static Order valueOf(OrderDTO orderDTO) {

		Order order = new Order();

		order.setId(orderDTO.getId());
		order.setAmount(orderDTO.getAmount());
		order.setPriceWhenSold(orderDTO.getPriceWhenSold());
		order.setProduct(orderDTO.getProduct());

		return order;
	}
	// ---- ValueOf ---- //

}
