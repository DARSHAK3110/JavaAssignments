package com.oop.ifaceImpl;

import com.oop.iface.Shape;

public class Square implements Shape {
	private Double length = 1.0;

	public Square(Double length) {
		super();
		this.length = length;
	}

	@Override
	public void draw() {
		System.out.println("Circle draw done");
	}

	@Override
	public void size() {
		System.out.println("Square size:- " + Math.pow(length, 2.0));
	}
}
