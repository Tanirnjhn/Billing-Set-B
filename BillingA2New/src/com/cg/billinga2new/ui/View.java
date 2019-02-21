package com.cg.billinga2new.ui;

import java.util.Scanner;

import com.cg.billinga2new.dao.IProductDAO;
import com.cg.billinga2new.dao.ProductDAO;
import com.cg.billinga2new.exception.ProductIdInvalidException;
import com.cg.billinga2new.service.IProductService;
import com.cg.billinga2new.service.ProductService;

public class View {

	
	public static void main(String[] args)throws ProductIdInvalidException {
		
		IProductDAO proDao = new ProductDAO();
      IProductService prodSer= new ProductService(proDao);
       Scanner scanner= new Scanner(System.in);
       
       System.out.println("Enter the product code");
       int c= scanner.nextInt();
       scanner.nextLine();
       boolean b=true;
       while(b)
       {
    	   if(c<=999 || c>=10000)
    	   {
    	   System.out.println("Enter code again");
    	   c=scanner.nextInt();
    	   scanner.nextLine();
       }
    	   else
    	   {
    		   b=false;
    	   }
       }
    	   
    	   System.out.println("Enter the quantity");
    	   int qty=scanner.nextInt();
    	   scanner.nextLine();
    	   b=true;
    	   while(b)
    	   {
    		   if(qty<=0)
    		   {
    			   System.out.println("Enter valid quantity");
    			   qty=scanner.nextInt();
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
    		   price= prodSer.getProductDetails(c).getProductPrice();
    		   int total=  price*qty;
    		   System.out.println("total:"+ total);
    		   
    	   }
      catch(ProductIdInvalidException  ee)
      {
    	  
		   System.out.println("product is not available");
      }
	
	}

	 }

