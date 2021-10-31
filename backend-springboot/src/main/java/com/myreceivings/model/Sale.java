package com.myreceivings.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Sale {

	@Id
	@GeneratedValue
	private long id;

	@OneToMany
	private List<Order> orders;

	@Column(name = "sale_date")
	private LocalDate saleDate;

	@OneToMany
	private List<SalePayment> payments;

	@Column
	private Customer customer;

	// --- DB control --//
	@Column(name = "created_at", nullable = false, updatable = false)
	private LocalDate createdAt;

	@Column(name = "updated_at")
	private LocalDate updatedAt;
	// --- DB control --//

	// -- Getters and Setters -- //
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public LocalDate getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}

	public List<SalePayment> getPayments() {
		return payments;
	}

	public void setPayments(List<SalePayment> payments) {
		this.payments = payments;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	// -- Getters and Setters -- //
	
	// --- DB control --//
	public void setCreatedAt(LocalDate date) {
		this.createdAt = date;
	}

	public void setUpdatedAt(LocalDate date) {
		this.updatedAt = date;
	}
	// --- DB control --//

}
