package com.string;

public class StringDemo {
	public static void main(String[] args) {
		String string1 = new String("Hello World"); //string object
		
		String string2 = "Hello World"; //string literal
		
		int length = string1.length();
		System.out.println("Length: " + length);
		
		char ch = string2.charAt(4);
		System.out.println("Character: " + ch);
		
		System.out.println("String to uppercase: " + string1.toUpperCase());
		
	}

}