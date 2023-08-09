package com.demo.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int price;
	
	@JoinColumn(name="cust_id")
	@ManyToOne(cascade = CascadeType.ALL)	
	Customer customer;
	
	

	public Orders() {
		super();
	}

	public Orders(int id, String name, int price, Customer customer) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.customer = customer;
	}
	
	public Orders(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
		

}
