package com.mousbah.defaultmethods;

public class UnitCircle  implements Circle{
	
	private int x;
	private int y;
	private double radius;

	public UnitCircle(int x, int y, double radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	

	public void setX(int x) {
		this.x = x;
	}


	public void setY(int y) {
		this.y = y;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public int getX() throws Exception {
		return x;
	}

	@Override
	public int getY() throws Exception {
		return y;
	}

	@Override
	public double getRadius() throws Exception {
		return radius;
	}

	

}
