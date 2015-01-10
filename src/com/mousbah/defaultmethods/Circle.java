package com.mousbah.defaultmethods;

public interface  Circle {
	
	public int getX() throws Exception;
	
	public int getY() throws Exception;
	
	public double getRadius() throws Exception;
	
	public default double getArea() throws Exception{
		return 3.14;
	}
	

}
