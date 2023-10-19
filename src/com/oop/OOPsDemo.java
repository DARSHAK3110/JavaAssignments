package com.oop;

import com.oop.ifaceImpl.Circle;
import com.oop.ifaceImpl.Rectangle;
import com.oop.ifaceImpl.Square;

public class OOPsDemo {
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(11.0);
		rectangle.setWidth(2.0);
		rectangle.draw();
		rectangle.size();

		Circle circle = new Circle();
		circle.setRadius(11.0);
		circle.draw();
		circle.size();
		
		Square square = new Square();
		square.setLength(11.0);
		square.draw();
		square.size();
	}
}
