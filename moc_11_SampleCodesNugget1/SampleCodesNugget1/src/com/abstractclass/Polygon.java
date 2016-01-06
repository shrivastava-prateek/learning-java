package com.abstractclass;

public abstract class Polygon {
	double area;
	public abstract void calcArea(double w,double l);
	
	public void display(){
		System.out.println("Area is: " + area);
	}
}
