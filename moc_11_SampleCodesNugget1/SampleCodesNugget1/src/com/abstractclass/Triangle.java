package com.abstractclass;

public class Triangle extends Polygon {
	@Override
	public void calcArea(double w, double l) {
		area = 0.5 * w * l;
	}
}
