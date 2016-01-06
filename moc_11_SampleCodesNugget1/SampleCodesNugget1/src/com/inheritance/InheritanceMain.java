package com.inheritance;

//package inheritance;

public class InheritanceMain {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Ramlal");
		person.setAddress("Pune");
		
		System.out.println("Name: " + person.getName());
		System.out.println("Address: " + person.getAddress());
		
		Employee employee = new Employee();
		employee.setName("Shamlal");
		employee.setAddress("Pune");
		employee.setEmpId(123);
		employee.setSalary(50000);
		
		System.out.println(employee.getName());
		System.out.println(employee.getAddress());
		System.out.println(employee.getEmpId());
		System.out.println(employee.getSalary());
		
		Student student = new Student();
		student.setName("Seeta");
		student.setAddress("Mumbai");
		student.setRollNo(111);
		student.setM1(78);
		student.setM2(89);
		student.setM3(87);
		
		System.out.println(student.getName());
		System.out.println(student.getAddress());
		System.out.println(student.getRollNo());
		System.out.println(student.getM1());
		System.out.println(student.getM2());
		System.out.println(student.getM3());
	}

}
