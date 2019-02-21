package com.cpgi.billing.ui;

import java.util.Scanner;

import com.cpgi.billing.bean.Sale;
import com.cpgi.billing.dao.SaleDAO;
import com.cpgi.billing.service.ISaleService;
import com.cpgi.billing.service.SaleService;

public class Client {

	
	public static void main(String[] args) {
		ISaleService isal= new SaleService(new SaleDAO());
		Scanner scanner= new Scanner(System.in);
		
		
		boolean check= true;
		int flag=1;
		System.out.println(" Enter a product code");
		int product= scanner.nextInt();
		scanner.nextLine();
		while(check)
		{
			if(isal.validateProductCode(product))
				check=false;
			else
			{
				System.out.println("Enter valid product code");
				product= scanner.nextInt();
				scanner.nextLine();
				
			}
		}
		
		 check= true;
		System.out.println(" Enter Quantity");
		int qty= scanner.nextInt();
		scanner.nextLine();
		while(check)
		{
			if(isal.validateQuantity(qty))
				check=false;
			else
			{
				System.out.println("Enter again quantity");
				qty= scanner.nextInt();
				scanner.nextLine();
			}
		}
		
	 check= true;
		System.out.println(" Enter a product category");
		String cat= scanner.nextLine();
		
		while(check)
		{
			if(isal.validateProductCat(cat))
				check=false;
			else
			{
				System.out.println("Enter category again");
				cat= scanner.nextLine();
			}
		}
		if(cat.equals("Electronics"))
		{
			flag=0;
		}
	check= true;
	System.out.println(" Enter a product name");
	String prodName= scanner.nextLine();
		while(check)
		{
			if(isal.validateProductName(prodName, flag))
				check=false;
			else
			{
				System.out.println("Enter valid product name");
				prodName= scanner.nextLine();
			}
		}
		
		 check= true;
		System.out.println(" Enter price ");
		int price= scanner.nextInt();
		scanner.nextLine();
		while(check)
		{
			if(isal.validateProductPrice(price))
				check=false;
			else
			{
				System.out.println("Enter product price again");
				product= scanner.nextInt();
				scanner.nextLine();
			}
		}
		int saleid=(int)Math.random()*1000;
		Sale sale=new Sale();
		sale.setSaleid(saleid);
		sale.setCategory(cat);
		sale.setProCode(product);
		sale.setProductName(prodName);
		sale.setQuantity(qty);
		sale.getSaleDate();
		sale.setLineTotal(qty*price);
		
		
				System.out.println("quantity is"+ sale.getQuantity());
				System.out.println("Total: "+ sale.getLineTotal());
				System.out.println("*"+isal.insertSaleDetails(sale));
	}

}
