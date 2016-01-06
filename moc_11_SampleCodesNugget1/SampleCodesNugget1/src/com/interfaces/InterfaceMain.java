package com.interfaces;
public class InterfaceMain {
	public static void main(String[] args) {
		Animal animal; //reference of interface
		
		animal = new Cat();
		animal.eat();
		animal.speak();
		
		animal = new Dog();
		animal.eat();
		animal.speak();
	}
}
