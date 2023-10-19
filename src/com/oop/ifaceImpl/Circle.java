package com.oop.ifaceImpl;

import java.util.logging.Logger;

import com.oop.iface.Shape;

public class Circle implements Shape{

	private Double radius = 1.0;
	Logger log = Logger.getLogger(Rectangle.class.getName());
	@Override
	public void draw() {
		log.info("Circle draw done");
	}

	@Override
	public void size() {
		log.info("Circle size:- "+2*Math.PI*radius);
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	
}
