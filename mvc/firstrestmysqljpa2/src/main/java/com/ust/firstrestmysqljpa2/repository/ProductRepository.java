package com.ust.firstrestmysqljpa2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.firstrestmysqljpa2.resource.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
	
	
	
	}