package com.myreceivings.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SalePayment {

	@Id
	@GeneratedValue
	private long id;

	@ManyToOne
	private Sale sale;

	// --- DB control --//
	@Column(name = "created_at", nullable = false, updatable = false)
	private LocalDate createdAt;

	@Column(name = "updated_at")
	private LocalDate updatedAt;
	// --- DB control --//

	private LocalDate date;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Sale getSale() {
		return sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	// --- DB control --//
	public void setCreatedAt(LocalDate date) {
		this.createdAt = date;
	}

	public void setUpdatedAt(LocalDate date) {
		this.updatedAt = date;
	}
	// --- DB control --//

}
