package methodreferences;

import java.util.Arrays;

public class StringInstanceMethodReference {
	
	public static void main(String[] args) {
		String stringArray[] = {"Ramlal","Laxman","Vijay","Aman","Saket"};		
		System.out.println("Before Sorting:");
		for (String string : stringArray) {
			System.out.println(string);
		}
		
		Arrays.sort(stringArray, String::compareTo);
		System.out.println("After sorting: ");
		for (String string : stringArray) {
			System.out.println(string);
		}		
	}
}
