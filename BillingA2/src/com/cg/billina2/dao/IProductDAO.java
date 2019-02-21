package com.cg.billina2.dao;

import com.cg.billina2.bean.Product;
import com.cg.billina2.exception.ProductIdInvalidException;

public interface IProductDAO {
 Product getProductDetails(int productCode) throws ProductIdInvalidException;
 
}
