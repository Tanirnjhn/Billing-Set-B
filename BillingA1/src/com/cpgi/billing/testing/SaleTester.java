package com.cpgi.billing.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cpgi.billing.dao.SaleDAO;
import com.cpgi.billing.service.ISaleService;
import com.cpgi.billing.service.SaleService;

public class SaleTester {
	ISaleService saleSer=new SaleService(new SaleDAO());

	@Test
	public void WhenInvalidCodeIsEnteredSystemReturnsFalse() {
		
	assertEquals(false,saleSer.validateProductCode(100));
	}
	
	@Test
	public void WhenValidCodeIsEnterSystemReturnTrue()
	{
		assertEquals(true, saleSer.validateProductCode(1001));
	}
	

}
