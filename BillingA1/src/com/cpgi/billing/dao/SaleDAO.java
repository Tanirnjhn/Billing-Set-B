package com.cpgi.billing.dao;

import java.util.HashMap;

import com.cpgi.billing.bean.Sale;

public class SaleDAO implements ISaleDAO{
 HashMap<Integer, Sale> hm = new HashMap<Integer, Sale>();
	public HashMap<Integer, Sale> insertSaleDetails(Sale sale) {
		hm.put(sale.getSaleid(),sale);
		return hm;
	}
	

}
