package com.staticdemo;

class Student{  
	   int rollNo;  
	   String name;  
	   static String college ="ITS";  
	     
	   Student(int rollNo,String name){  
	   this.rollNo = rollNo;  
	   this.name = name;  
	   }  
	 void display (){System.out.println(rollNo+" "+name+" "+college);}  
	  
	 public static void main(String args[]){  
	 Student s1 = new Student(111,"Karan");  
	 Student s2 = new Student(222,"Aryan");  
	   
	 s1.display();  
	 s2.display();  
	 }  
	}  
