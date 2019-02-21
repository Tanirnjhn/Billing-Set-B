package com.cg.billinga2new.service;

import com.cg.billinga2new.bean.Product;
import com.cg.billinga2new.exception.ProductIdInvalidException;

public interface IProductService {
Product getProductDetails(int productCode) throws ProductIdInvalidException;
}
