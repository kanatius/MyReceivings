package com.myreceivings.dto;

import java.time.LocalDate;
import java.util.List;

import com.myreceivings.model.Customer;
import com.myreceivings.model.Order;
import com.myreceivings.model.SalePayment;

public class SaleDTO {
	
	private long id;

	private List<Order> orders;

	private LocalDate saleDate;

	private List<SalePayment> payments;

	private Customer customer;

	
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
	
}
