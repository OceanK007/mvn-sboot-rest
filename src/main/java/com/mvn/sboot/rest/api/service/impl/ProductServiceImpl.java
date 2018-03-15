package com.mvn.sboot.rest.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvn.sboot.rest.api.dao.ProductRepository;
import com.mvn.sboot.rest.api.service.ProductService;
import com.mvn.sboot.rest.data.dto.Product;

@Service
public class ProductServiceImpl implements ProductService
{
	@Autowired
	ProductRepository productRepository; 
	
	@Override
	public Product createProduct(Product product) 
	{
		return productRepository.createProduct(product);
	}

	@Override
	public List<Product> searchProduct(String productType) 
	{
		return productRepository.searchProduct(productType);
	}

	@Override
	public Product removeProduct(Long productId) 
	{
		return productRepository.removeProduct(productId);
	}
}
