package com.abstractclass;

public class Rectangle extends Polygon {
	@Override
	public void calcArea(double w, double l) {
		area = w * l;
	}
}
