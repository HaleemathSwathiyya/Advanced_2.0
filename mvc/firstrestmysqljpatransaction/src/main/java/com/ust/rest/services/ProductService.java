package com.ust.rest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ust.rest.repository.ProductRepository;
import com.ust.rest.repository.UserRepository;
import com.ust.rest.resource.Product;
import com.ust.rest.resource.User;

@Service
public class ProductService {
	@Autowired
	UserRepository userRepository;
	@Autowired
	ProductRepository productRepository;
	
public Product getProduct(long ProductId) {
		
		Optional<Product> optional = productRepository.findById(ProductId);
		if(optional.isPresent())
			return optional.get();
		else
			return null;
		
	}

//	public Product getProduct(long productId) {
//		return repository.getProduct(productId);
//	}
//	
//	public ArrayList<Product> getProducts(){
//		return repository.getProducts();
//	}
//	public boolean add(Product product) {
//		repository.save(product);
//		return true;
//	}
	
//	@Transactional(propagation = Propagation.REQUIRED)
//	public Product add(Product product) {
////		if(validate(product)) {
////			productRepository.save(product);
//			Product productT = productRepository.save(product);
//			User user = new User();
//			user.setUserId(5L);
//			user.setDataTime(System.currentTimeMillis()+"767676767676767676767676767676767676767676767676767676767676767");
//			User userT = userRepository.save(user);
//			return productT;
//				
//			//return false; //cannot create duplicate product
//		}
//		else {
//			productRepository.save(product);
//			return true;
//		}

//Example 2 reqires_new

@Transactional(propagation = Propagation.REQUIRED)
public Product add(Product product) {
		Product productT = productRepository.save(product);
		addUser();
		return productT;
		
//		if(validate(product)) {
//		productRepository.save(product);
		
//		User user = new User();
//		user.setUserId(5L);
//		user.setDataTime(System.currentTimeMillis()+"767676767676767676767676767676767676767676767676767676767676767");
//		User userT = userRepository.save(user);
		
}	
@Transactional(propagation = Propagation.REQUIRES_NEW)
public boolean addUser() {
	
	User user = new User();
	user.setUserId(5L);
	user.setDataTime(System.currentTimeMillis()+"767676767676767676767676767676767676767676767676767676767676767");
	try {
		User userT = userRepository.save(user);
	}catch (Exception e) {
		System.out.println(e);
	}
//	User userT = userRepository.save(user);
	return true;	
}
			
		//return false; //cannot create duplicate product
	
	
	public boolean validate(Product product) {
		if(product.getName().equals("Laptop")) {
			return true;
		}
		else {
			return false;
		}
	}
	
//	public Product updateProduct(Product product) {
//		return repository.updateProduct(product);
//	}
//	public void deleteProduct(long ProductId) {
//		repository.delete(ProductId);
//	}
	
	public List<Product> getProducts(){
		return productRepository.findAll();
	}
	
}
