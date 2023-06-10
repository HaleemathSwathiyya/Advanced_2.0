package com.ust.rest.resource;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Entity
//@Getter
//@Setter
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor    
public class Product {
	
	@Id
	//@GeneratedValue(strategy =GenerationType.IDENTITY) //Generation type is the strategy which the jpa should use or follow to generate primary key values
	//the default generation type is auto whrn strategy is not specified jpa uses auto strategy
	//when the underlying database is mysql generation type.auto means the jpa will create a hybernate sequence in the database for generation of primary keys
	
	//hibernate query
	
	//Hibernate: select next_val as id_val from hibernate_sequence for update
	//Hibernate: update hibernate_sequence set next_val= ? where next_val=?
	//Hibernate: insert into product (description, name, price, qty, product_id) values (?, ?, ?, ?, ?)
	
	//generationtype.identity fot this strategy to work first we have to create a table in MySql database and explicitly specify the auto increment(AI) coloumn as checked for the primary key coloumn and
	//in apllication.properties file "spring.jpa.hibernate.ddl-auto" this should not be set if its set it should have value as update 
	private String _id;
	
	private String name;
	
	private String description;
	
	private BigDecimal price;
	
	private int qty;
	
	
//	public long getProductId() {
//		return ProductId;
//	}
//	public void setProductId(long productId) {
//		ProductId = productId;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	public BigDecimal getPrice() {
//		return price;
//	}
//	public void setPrice(BigDecimal price) {
//		this.price = price;
//	}
//	public int getQty() {
//		return qty;
//	}
//	public void setQty(int qty) {
//		this.qty = qty;
//	}
	
	
	
	

}
