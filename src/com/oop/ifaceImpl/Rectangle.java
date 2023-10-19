package com.oop.ifaceImpl;

import java.util.logging.Logger;

import com.oop.iface.Shape;

public class Rectangle implements Shape {

	private Double length = 1.0;
	private Double width = 1.0;
	Logger log = Logger.getLogger(Rectangle.class.getName());

	@Override
	public void draw() {
		log.info("Rectangle draw done");
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}
	@Override
	public void size() {
		log.info("Rectangle size:- "+length*width);
	}

}
