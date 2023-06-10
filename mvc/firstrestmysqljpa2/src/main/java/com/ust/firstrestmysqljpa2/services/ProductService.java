package com.ust.firstrestmysqljpa2.services;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.firstrestmysqljpa2.repository.ProductRepository;
import com.ust.firstrestmysqljpa2.resource.Product;


@Service
public class ProductService {
	@Autowired
//	ProductRepository repository;
	ProductRepository productRepository;
	
	public Product getProduct(long productId) {
//		Optional<Product> optional = repository.findById(productId);
		Optional<Product> optional = productRepository.findById(productId);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
//		return repository.getProduct(productId);
	}
//	}
//	
	public List<Product> getProducts(){
		return productRepository.findAll();
		
	}
//	public boolean add(Product product) {
	public Product add(Product product) {	
//		repository.save(product);
		Product productT = productRepository.save(product);
		return productT;
//		return true;
	}
    public Product updateProduct(Product product) {
    	Optional<Product> optional = productRepository.findById(product.getProductId());
    			Product tempProduct = optional.get();
    	
    	tempProduct.setName(product.getName());
    	tempProduct.setDescription(product.getDescription());
    	tempProduct.setPrice(product.getPrice());
    	tempProduct.setQty(product.getQty());
    	
    	return productRepository.save(product);
    	
//    	return repository.save(product);
    }
    public void deleteProduct(long productId) {
    	productRepository.deleteById(productId);
    }

}