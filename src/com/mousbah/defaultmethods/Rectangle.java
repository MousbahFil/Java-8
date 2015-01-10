package com.mousbah.defaultmethods;

public interface  Rectangle {

	public default double getArea() throws Exception{
		return 1;
	}
}
