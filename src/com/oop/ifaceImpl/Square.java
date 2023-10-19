package com.oop.ifaceImpl;

import java.util.logging.Logger;

import com.oop.iface.Shape;

public class Square implements Shape{
	private Double length = 1.0;
	Logger log = Logger.getLogger(Rectangle.class.getName());

	@Override
	public void draw() {
		log.info("Circle draw done");
	}

	@Override
	public void size() {
		log.info("Square size:- " + Math.pow(length,2.0));
	}
	
	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

}
