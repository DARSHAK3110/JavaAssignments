package com.oop.ifaceImpl;

import com.oop.iface.Shape;

public class Circle implements Shape {

	public Double radius = 1.0;

	public Circle(Double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle draw done");
	}

	@Override
	public void size() {
		System.out.println("Circle size:- " + 2 * Math.PI * radius);
	}
}
