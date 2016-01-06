package com.abstractclass;

public class PolygonMain {
	public static void main(String[] args) {
		Polygon p; //reference of Polygon. its default value is null
				   //can hold object of its own type and subclasses
		
		//p = new Polygon(); //now p is object of Polygon
		//p.calcArea(12.34, 23.34);
		//p.display();
		
		p = new Rectangle();//upcasting
		p.calcArea(12.34, 23.34);
		p.display();
		
		p = new Triangle();//upcasting
		p.calcArea(12.34, 23.34);
		p.display();
		
		Rectangle r ; //only Rectangle objects can be stored
		
		Triangle t ; //
	}

}
