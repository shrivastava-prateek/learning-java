/*
 * Assignment 1
 * 	Find the number of occurrences of given word in a sentence.
        static int check(String sentence,String word){
 */
package com.assignments;

public class OccuranceCheck {
		static int check(String sentence, String word){
			int count = 0;
			String words[] = sentence.split(" ");
			for (String string : words) {
				if(string.equalsIgnoreCase(word)){
					count++;
				}
			}
			return count;
		}
		public static void main(String[] args) {
			System.out.println(check("is is is is as as as is is ","is"));
		}
	}


