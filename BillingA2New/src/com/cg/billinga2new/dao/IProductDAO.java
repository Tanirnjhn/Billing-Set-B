package com.cg.billinga2new.dao;

import com.cg.billinga2new.bean.Product;
import com.cg.billinga2new.exception.ProductIdInvalidException;

public interface IProductDAO {

	Product getProductDetails(int productCode)throws ProductIdInvalidException;
}
