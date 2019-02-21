package com.cg.billinga2.service;

import com.cg.billina2.bean.Product;
import com.cg.billina2.dao.IProductDAO;
import com.cg.billina2.dao.ProductDAO;
import com.cg.billina2.exception.ProductIdInvalidException;

public class ProductService implements IProductService{
 IProductDAO pDao;
 
	public ProductService(ProductDAO productDAO) {
	super();
	
}

	public Product getProductDetails(int productCode) throws ProductIdInvalidException {
	
		return pDao.getProductDetails(productCode);
	}

}
