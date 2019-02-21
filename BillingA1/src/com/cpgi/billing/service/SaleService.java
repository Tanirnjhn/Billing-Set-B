package com.cpgi.billing.service;

import java.util.HashMap;

import com.cpgi.billing.bean.Sale;
import com.cpgi.billing.dao.ISaleDAO;
import com.cpgi.billing.dao.SaleDAO;

public class SaleService implements ISaleService {
	ISaleDAO isal=new SaleDAO();
	

	public SaleService() {
		super();
		
	}

	public SaleService(ISaleDAO isal) {
		super();
		this.isal = isal;
	}
HashMap<Integer, Sale> hmm= new HashMap<Integer, Sale>();
	public HashMap<Integer, Sale> insertSaleDetails(Sale sale) {
		System.out.println("Service:"+sale);
		hmm=isal.insertSaleDetails(sale);
		return hmm;
	}

	public boolean validateProductCode(int productId) {
		if(productId==1001 || productId==1002 || productId==1003 || productId==1004)
			return true;
		return false;
	}

	public boolean validateQuantity(int Qty) {
		if(Qty>0 && Qty<5)
			return true;
		return false;
	}

	public boolean validateProductCat(String prodCat) {
	if(prodCat.equals("Electronics")|| prodCat.equals("Toys"))
		return true;
	return false;
		
	
	}

	public boolean validateProductName(String prodName, int flag) {
		if((flag==0 && prodName.equals("TV") || prodName.equals("Smart Phone") || prodName.equals("video game"))
				|| prodName.equals("Soft Toy") || prodName.equals(" Telescope") || prodName.equals(" Barbee Doll"))
			return true;
		return false;
	}

	public boolean validateProductPrice(float price) {
		if(price>200)
			return true;
		return false;
	}

	

}
