package com.UserInterface;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.id.IntegralDataTypeHolder;

import com.hibernate.services.CustomerServices;
import com.hibernate.services.ProductServices;

public class ManageRecords {

	public static void main(String args[]) {
		
		/*-----------------------------------------Product Crud Operation-----------------------------------------------*/
		ProductServices productServices=new ProductServices();
		
		Integer product1=productServices.addProduct("Electronics", "Mobile", "Oneplus", 60000, 2);
		
		List<Integer> listProduct=new ArrayList<>();
		listProduct.add(product1);
		if(listProduct.size()!=0) {
			System.out.println("Record is inserted");
		}
		else
		{
			System.out.println("Record is not inserted");
		}
		
		/*List of product records in databse*/
		try {
			productServices.listOfAllProducts();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		/*Update product records in database*/
		try {
		productServices.updateProductDetails(3, 72000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		/* delete product records in database by id */
		try {
			productServices.deleteProductById(4);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		/*------------------------------------------End of product crud operation-------------------------------------*/
		
		/*------------------------------------------Customer crud operation-------------------------------------------*/
		CustomerServices customerServices=new CustomerServices();
		
		Integer customer1=customerServices.addCustomer("Anshul", "agarwal", "9602653878");
		Integer customer2=customerServices.addCustomer("ansh", "Agarwal", "9461404491");
		List<Integer> listOfCustomer=new ArrayList<>();
		listOfCustomer.add(customer1);
		listOfCustomer.add(customer2);
		if(listOfCustomer.size()!=0) {
			System.out.println("Record is inserted ");
		}
		else {
			System.out.println("Record is not inserted ");
		}
		
		/*List of all customer*/
		try {
			customerServices.listOfAllCustomers();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		/*Update customer record in database*/
		try {
			customerServices.updateCustomerDetails(8, "9461404491");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		/*Delete customer record in database by id*/
		try {
			customerServices.deleteCustomerById(4);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		/*------------------------------------------End of crud operation---------------------------------------------*/
	}
}
