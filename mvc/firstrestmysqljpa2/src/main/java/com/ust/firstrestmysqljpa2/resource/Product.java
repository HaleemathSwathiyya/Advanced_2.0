package com.ust.firstrestmysqljpa2.resource;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity
public class Product {
	
	/*
	 * select next_val as id_val from hibernate_sequence for update
	Hibernate: update hibernate_sequence set next_val= ? where next_val=?
	Hibernate: insert into product (description, name, price, qty, product_id) values (?, ?, ?, ?, ?)
	 */
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)  
	//generation type is a strategy which a jpa should use or follow to generate primary key values
	//the default generation type is AUTO. WHEN A STARTEGY IS NOT SPECIFIED JPA USES AUTO STARTEGY.
	// WHEN THE UNDERLINED DATABASE IS MYSQL GENERATIONType.AUTO means, the jpa will create a hibernate sequence in the
	//database for generation of primary keys
	//GenerationType.IDENTITY - for this strategy to work first we have to create a table in mysql and explicitly specify the auto increment
	//(AI) as checked for the primary key column 
	// and in application.properties file spring.jpa.hibernate.ddl-auto=update - this should not be set,if it is set it should have value as update
	
	
	private long productId;
	private String name;
	private String description;
	private BigDecimal price;
	private int qty;

	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	

}