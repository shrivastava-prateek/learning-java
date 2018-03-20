package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResc {

	public static void main(String[] args) {
try(BufferedReader br = new BufferedReader(new FileReader("abc.txt"))){
	String data=null;
	while((data=br.readLine())!=null){
		System.out.println(data);
		
	}
}catch(IOException e){
	
}
	}

}
