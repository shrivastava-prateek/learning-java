package com.constructorsininheritance;

public class InheritanceMain {
	public static void main(String[] args) {
		Person person = new Person("Ramlal","Pune");
		
		
		System.out.println("Name: " + person.getName());
		System.out.println("Address: " + person.getAddress());
		
		Employee employee = new Employee(123,50000,"Shamlal","Pune");
		
		
		System.out.println(employee.getName());
		System.out.println(employee.getAddress());
		System.out.println(employee.getEmpId());
		System.out.println(employee.getSalary());
		
		Student student = new Student(1,67,78,89,"Seeta","Mumbai");
		
		
		System.out.println(student.getName());
		System.out.println(student.getAddress());
		System.out.println(student.getRollNo());
		System.out.println(student.getM1());
		System.out.println(student.getM2());
		System.out.println(student.getM3());
	}

}
