

package com.ust.rest.services.interfaces;

import java.util.List;

import com.ust.rest.resource.Product;

public interface ProductServiceIface {
	
	public Product getProduct(String productId);
	
	public List<Product> getProducts();
	
	public Product add(Product product);
	
	public Product updateProduct(Product product);
	
	public void deleteProduct(String productId);
	

}

