package com.mvn.sboot.rest.api.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.mvn.sboot.rest.data.dto.Product;

@Component
public class ProductRepository 
{
	public static final Set<Product> productList = new HashSet<>();
	
	public Product createProduct(Product product) 
	{
		product.setId(getNextIdValue());
		product.setActive(true);
		productList.add(product);
		return product;
	}

	public List<Product> searchProduct(String productType) 
	{
		List<Product> searchResult = new ArrayList<>();
		for(Product product : productList)
		{
			if(product.getProductType().getValue().equals(productType) && product.isActive() == true)
			{
				searchResult.add(product);
			}
		}
		
		return searchResult;
	}

	public Product removeProduct(Long productId) 
	{
		Product deletedProduct = null;
		for(Product product : productList)
		{
			if(product.getId().equals(productId))
			{
				product.setActive(false);
				deletedProduct = product;
			}
		}
		
		return deletedProduct;
	}
	
	public Long getNextIdValue()
	{
		Long id = 0L;
		
		if(productList.size() > 0)
		{
			for(Product product : productList)
			{
				if(product.getId() > id)
					id = product.getId();
			}
		}
		
		return id + 1; 
	}
}
