package com.myreceivings.dto;

import com.myreceivings.model.Customer;

public class CustomerDTO {

	private long id;

	private String name;

	private String phoneNumber;

	private String address;

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
	public CustomerDTO valueOf(Customer customer) {

		CustomerDTO customerDTO = new CustomerDTO();

		customerDTO.setAddress(customer.getAddress());
		customerDTO.setId(customer.getId());
		customerDTO.setName(customer.getName());
		customerDTO.setPhoneNumber(customer.getPhoneNumber());

		return customerDTO;

	}
	// --- ValueOf --- //
}
