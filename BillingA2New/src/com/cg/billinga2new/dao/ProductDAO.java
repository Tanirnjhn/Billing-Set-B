package com.cg.billinga2new.dao;

import java.util.HashMap;

import com.cg.billinga2new.bean.Product;
import com.cg.billinga2new.exception.ProductIdInvalidException;
import com.cg.billinga2new.util.CollectionUtil;


public class ProductDAO implements IProductDAO {

CollectionUtil  collectionUtil;
Product prod;
 HashMap<Integer,Product> hm= new HashMap<Integer, Product>();
@Override
public Product getProductDetails(int productCode)
		throws ProductIdInvalidException {
	
	prod=collectionUtil.getProducts().get(prod);
	if(prod== null)
	
		throw new ProductIdInvalidException(); 
	return prod;
}
}