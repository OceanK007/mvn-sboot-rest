package com.mvn.sboot.rest.api.service;

import java.util.List;

import com.mvn.sboot.rest.data.dto.Product;

public interface ProductService 
{
	Product createProduct(Product product);
	List<Product> searchProduct(String productType);
	Product removeProduct(Long productId);
}
