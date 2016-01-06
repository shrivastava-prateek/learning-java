/*
 * Assignment 4
 * 	Write a program that will reverse the sequence of letters in each word of a chosen paragraph . For instance, " To be or not to be " Would become " oT eb ro ton ot eb".  
		static String  makeReverse(String str)
 */
package com.assignments;

public class ReverseString {
	static String reverseString(String inputString){
		String reversedString = "";
	      
	      for ( int i = inputString.length() - 1 ; i >= 0 ; i-- ){
	    	  reversedString = reversedString + inputString.charAt(i);
	      }
		 return reversedString;		
	}
	public static void main(String[] args) {
		System.out.println(reverseString("abcdefghijk"));

	}

}