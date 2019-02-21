package com.cpgi.billing.dao;

import java.util.HashMap;

import com.cpgi.billing.bean.Sale;

public interface ISaleDAO {
public HashMap<Integer,Sale> insertSaleDetails(Sale sale);
}
