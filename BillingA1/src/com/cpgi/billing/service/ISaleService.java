package com.cpgi.billing.service;

import java.util.HashMap;

import com.cpgi.billing.bean.Sale;

public interface ISaleService {
public HashMap<Integer, Sale> insertSaleDetails(Sale sale);
public boolean validateProductCode(int productId);
boolean validateQuantity(int Qty);
public boolean validateProductCat(String prodCat);
public boolean validateProductName(String prodName,int flag);
public boolean validateProductPrice(float price);
}
