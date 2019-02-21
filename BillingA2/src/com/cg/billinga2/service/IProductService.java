package com.cg.billinga2.service;

import com.cg.billina2.bean.Product;
import com.cg.billina2.exception.ProductIdInvalidException;

public interface IProductService {
Product getProductDetails(int productCode)throws ProductIdInvalidException;
}
