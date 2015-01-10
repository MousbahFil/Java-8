package com.mousbah.defaultmethods;

public class Quadrilater implements Circle, Rectangle{

	@Override
	public int getX() throws Exception {
		return 0;
	}

	@Override
	public int getY() throws Exception {
		return 0;
	}

	@Override
	public double getRadius() throws Exception {
		return 0;
	}

	@Override
	public double getArea() throws Exception {
		return 5;
	}

}
