/*
 * Assignment 2
 * 	Ezee Shop has an online portal where customers can check about different products. Customers can search for products by giving a key word. Write a program that accepts a product name and a key word, and checks if the key word is present in the given product name.
		static String[] initProductNames()
		static boolean isPresent(String[] productNames, String keyword)
 */
package com.assignments;

public class ProductSearch {
	static String[] initProductNames(){
		String products[] = new String[5];
		products[0] = "Laptop";
		products[1] = "Desktop";
		products[2] = "Ipod";
		products[3] = "Tablet";
		products[4] = "Ipad";
		
		return products;
	}
	
	static boolean isPresent(String[] productNames, String keyword){
		boolean isPresent = false;
		for (String string : productNames) {
			if(string.equalsIgnoreCase(keyword))
				isPresent = true;
			break;
		}
		return isPresent;
	}
	public static void main(String[] args) {
		String products[] = initProductNames(); 
		boolean isProductAvailable = isPresent(products, "laptop");
		if(isProductAvailable){
			System.out.println("Product available");
		}else {
			System.out.println("Product not available");
		}
	}
}
