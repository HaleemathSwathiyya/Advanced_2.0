package com.ust.rest.resource;

import java.math.BigDecimal;

import javax.persistence.Column;

/* 
 * 
 *  select next_val as id_val from hibernate_sequence for update
Hibernate: update hibernate_sequence set next_val= ? where next_val=?
Hibernate: insert into product (description, name, price, qty, product_id) values (?, ?, ?, ?, ?)
 * 
 * 
 * Hibernate: drop table if exists hibernate_sequence
Hibernate: drop table if exists product
Hibernate: create table hibernate_sequence (next_val bigint) engine=InnoDB
Hibernate: insert into hibernate_sequence values ( 1 )
Hibernate: create table product (product_id bigint not null, description varchar(255), name varchar(255), price decimal(19,2), qty integer not null, primary key (product_id)) engine=InnoDB
 * 
 * 
 * Homework - Sequence and Table.
 * 
 * */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class Product {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO) 
	
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	//For this strategy to work , first we have to create a MySql database and explicitly specify the auto-increment
	//column as checked for the primary key column and in application.properties file -
	//#spring.jpa.hibernate.ddl-auto=update
	//This should not be said
	//If it is said, it should have value as 'update'
	

	
//	@GeneratedValue(GenerationType.AUTO) 
	
	//AUTO is the default generation type.
	//gENERTAIOn type is the strategy which the JPA should use or follow to generate primary key values.
	//The default generation type is AUTO ie, when strategy is not specified JPA uses AUTO strategy.
	//When the underlined database is MySql, generation tYPE.auto MEANS JPA WILL CRERATE A HYBERNATE-
	//SEQUENCE IN THE DATABASE FOR generation of primary keys.
	
	private long productId;
	@Column(name = "productName")
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
