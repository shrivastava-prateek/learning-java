package com;

public class DefaultImpl implements InterfaceA,InterfaceB {
	public static void main(String[] args){
		DefaultImpl obj = new DefaultImpl();
		obj.display();
		
		
	}
	@Override
	public void display(){
		System.out.println("Inside Implementor");
		InterfaceA.super.display();
		InterfaceB.super.display();
	}

}
