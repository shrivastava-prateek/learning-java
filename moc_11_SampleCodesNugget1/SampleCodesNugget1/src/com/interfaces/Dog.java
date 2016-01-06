package com.interfaces;
public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("Bone");
	}

	@Override
	public void speak() {
		System.out.println("Bark");
	}

}
