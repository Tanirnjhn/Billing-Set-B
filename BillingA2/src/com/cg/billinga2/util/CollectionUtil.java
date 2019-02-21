package com.cg.billinga2.util;

import java.util.HashMap;
import java.util.Map;

import com.cg.billina2.bean.Product;

public class CollectionUtil {
private static Map<Integer,Product> mp=new HashMap <Integer,Product>();
static{
	mp.put(1002,new Product(1001,"iPhone","Electronics",35000));
	mp.put(1001,new Product(1002,"LEDTV","Electronics",45000));
	mp.put(1003,new Product(1003,"Teddy","Toys",800));
	mp.put(1004,new Product(1004,"Telescope","Toys",5000));
	
		
}
public static Map<Integer, Product> getMp() {
	return mp;
}
public static void setMp(Map<Integer, Product> mp) {
	CollectionUtil.mp = mp;
}

}
