package com.oop.ifaceImpl;

import com.oop.iface.Shape;

public class Rectangle implements Shape {

	private Double length = 1.0;
	private Double width = 1.0;

	public Rectangle(Double length, Double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public void draw() {
		System.out.println("Rectangle draw done");
	}

	@Override
	public void size() {
		System.out.println("Rectangle size:- " + length * width);
	}
}
