package com.cg.billinga2.view;

import java.util.Scanner;

import com.cg.billina2.dao.ProductDAO;
import com.cg.billina2.exception.ProductIdInvalidException;
import com.cg.billinga2.service.IProductService;
import com.cg.billinga2.service.ProductService;


public class ServiceMain {

	public static void main(String[] args) throws ProductIdInvalidException
	{
		
		IProductService proSer= new ProductService(new ProductDAO());
		Scanner scanner= new Scanner(System.in);
 System.out.println("Enter Product Code");
 int c= scanner.nextInt();
 scanner.nextLine();
 boolean b= true;
 while(b)
 { if(c<=999 || c>=10000)
 {
	 System.out.println("Enter valid cade");
	 c=scanner.nextInt();
	 scanner.nextLine();
 }
 else
 {
	 b= false;
	 
 }
 }
 System.out.println("Enter Quantity");
 int qty=scanner.nextInt();
 scanner.nextLine();
 b=true;
 while(b)
 {
	 if(qty<=0)
	 {
		 System.out.println("Enter valid Quantity");
		 c=scanner.nextInt();
		 scanner.nextLine();
		 
	 }
	 else
	 {
		 b=false;
	 }
	 
 }
 try
 {
	 int price;
	 price=proSer.getProductDetails(c).getProductPrice();
 int total=price*qty;
 System.out.println("Total:"+ total);
 
 
 }
 catch(ProductIdInvalidException e)
 {
	 System.out.println("Product is no available");
 }
 
 	}

	}
