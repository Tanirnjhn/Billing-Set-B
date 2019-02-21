package com.cg.billina2.dao;

import java.util.HashMap;

import com.cg.billina2.bean.Product;
import com.cg.billina2.exception.ProductIdInvalidException;
import com.cg.billinga2.util.CollectionUtil;

public class ProductDAO implements IProductDAO 
{
	CollectionUtil util;
	Product product;
	 HashMap<Integer,Product> hm=new HashMap<Integer,Product>();
	
	 public Product getProductDetails(int productCode) throws ProductIdInvalidException 
	{
		product=util.getMp().get(productCode);
		if(product==null)
			throw new ProductIdInvalidException();
		
		
		return product;
	}

}
