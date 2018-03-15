package com.mvn.sboot.rest.api.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mvn.sboot.rest.api.service.ProductService;
import com.mvn.sboot.rest.data.dto.Product;

@RestController
@RequestMapping("api/product")
public class ProductApi 
{
	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) 
	{
		return productService.createProduct(product);
	}

	@RequestMapping(value="/search", method=RequestMethod.GET)
	public List<Product> searchProduct(@RequestParam(value="productType", required=true) String productType) 
	{
		return productService.searchProduct(productType);
	}

	@RequestMapping(value="/remove", method=RequestMethod.GET)
	public Product removeProduct(@RequestParam(value="productId", required=true) Long productId) 
	{
		return productService.removeProduct(productId);
	}
}
