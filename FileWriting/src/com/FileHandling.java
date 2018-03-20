package com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling extends Thread {
	static boolean flag=false;
	static String text=null;
	public FileHandling(String name) {
		super(name);
	}
	
	@Override
	public void run(){
		
		if(getName().equals("INPUT")){
			//if(flag==false){
				synchronized(""){
					Scanner sc=new Scanner(System.in);
				System.out.println("Enter text: ");
				text=sc.nextLine();
				flag=true;
				try{
				notify();
				}catch(Exception e){}
				sc.close();
				}
			
				
			
		}
		else{
			synchronized(""){
			System.out.println("In else");
			if(flag==false){
				System.out.println("flag=true");
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
				try {
					System.out.println("Creating file");
					FileWriter fw=new FileWriter(new File("file.txt"));
					BufferedWriter bw= new BufferedWriter(fw);
					bw.write(text);
					bw.close();
					fw.close();
					System.out.println("File Created and written");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		
	}
	
	
	
	public static void main(String[] args) {
		FileHandling f1=new FileHandling("INPUT");
		FileHandling f2=new FileHandling("OUTPUT");
		//f1.setPriority(MAX_PRIORITY);
		//f2.setPriority(MIN_PRIORITY);
		f1.start();
		f2.start();
		
	}

}
