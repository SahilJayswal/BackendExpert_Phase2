package com.ecommerce;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;  
import javax.persistence.Table;  


@Entity
@Table(name="eproduct")
public class EProduct{
	
	@Id @GeneratedValue
	@Column(name="ID")
	private long ID;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private BigDecimal price;
	
	@Column(name="date_added")
	private Date dateAdded;

	
	public EProduct(long ID, String name, BigDecimal price, Date dateAdded) {
		super();
		this.ID = ID;
		this.name = name;
		this.price = price;
		this.dateAdded = dateAdded;
	}

	public long getID() {
		return this.ID;
	}

	public void setID(long ID) {
		this.ID = ID;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date date) {
		this.dateAdded = date;
	}

	
}


