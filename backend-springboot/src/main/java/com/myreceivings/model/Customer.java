package com.myreceivings.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.myreceivings.dto.CustomerDTO;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false)
	private String name;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column
	private String address;

	// --- DB control -- //
	@Column(name = "created_at", nullable = false)
	private LocalDate createdAt;

	@Column(name = "updated_at")
	private LocalDate updatedAt;
	// --- DB control -- //

	// --- DB control -- //
	public void setCreatedAt(LocalDate date) {
		this.createdAt = date;
	}

	public void setUpdatedAt(LocalDate date) {
		this.updatedAt = date;
	}
	// --- DB control -- //

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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// ---- Getters and Setters ---- //

	// --- ValueOf --- //
	public Customer valueOf(CustomerDTO customerDTO) {

		Customer customer = new Customer();
		
		customer.setAddress(customerDTO.getAddress());
		customer.setId(customerDTO.getId());
		customer.setName(customerDTO.getName());
		customer.setPhoneNumber(customerDTO.getPhoneNumber());

		return customer;

	}
	// --- ValueOf --- //

}
