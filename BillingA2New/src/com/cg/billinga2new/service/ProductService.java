package com.cg.billinga2new.service;

import com.cg.billinga2new.bean.Product;
import com.cg.billinga2new.dao.IProductDAO;
import com.cg.billinga2new.dao.ProductDAO;
import com.cg.billinga2new.exception.ProductIdInvalidException;

public class ProductService implements IProductService{
	
   IProductDAO iProdDao;
   
   
	


	public ProductService(IProductDAO iProdDao) {
	super();
	this.iProdDao = iProdDao;
}





	@Override
	public Product getProductDetails(int productCode)
			throws ProductIdInvalidException {
		
		return iProdDao.getProductDetails(productCode);
	}

}
