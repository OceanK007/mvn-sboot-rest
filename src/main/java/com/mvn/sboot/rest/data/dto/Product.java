package com.mvn.sboot.rest.data.dto;

import com.mvn.sboot.rest.data.enums.ProductType;

public class Product 
{
	Long id;
	String name;
	ProductType productType;
	Double cost;
	boolean isActive;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	@Override
	public int hashCode()
	{
		return id.intValue();
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof Product)
		{
			Product p = (Product) obj;
			if(p.id.equals(this.id))
			{
				return true;
			}
			else 
				return false;
		}
		else
		{
			return false;
		}
	}
}
