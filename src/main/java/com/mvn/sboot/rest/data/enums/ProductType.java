package com.mvn.sboot.rest.data.enums;

import java.util.HashMap;

public enum ProductType 
{
	MOBILE("MOBILE"),
	ELECTRONICS("ELECTRONICS"),
	CLOTHES("CLOTHES"),
	FURNITURE("FURNITURE"),
	BOOKS("BOOKS");
	
	private String value;
	private static HashMap<String, ProductType> valueLookup = new HashMap<String, ProductType>();
	
	static
	{
		for(ProductType productType: values())
		{
			valueLookup.put(productType.getValue().toLowerCase(), productType);
		}
	}
	
	ProductType(String value)
	{
		this.value = value;
	}
	
	public String getValue()
	{
		return value;
	}
	
	public static ProductType getByValue(String value)
	{
		ProductType productType = null;
		if(value != null)
		{
			productType = valueLookup.get(value.toLowerCase());
		}
		return productType;
	}
}
