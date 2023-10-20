package com.oop;

import java.util.Scanner;

import com.oop.iface.Shape;
import com.oop.ifaceImpl.Circle;
import com.oop.ifaceImpl.Rectangle;
import com.oop.ifaceImpl.Square;

public class OOPsDemo {
	public static void main(String[] args) {
		
		
		try (Scanner sc = new Scanner(System.in)) {
			loop: while(true) {
				System.out.println("Press 1: Circle");
				System.out.println("Press 2: Square");
				System.out.println("Press 3: Rectangle");
				System.out.println("Press 4: Exit");
				int nextInt = sc.nextInt();
				switch(nextInt) {
				case 1: 
					System.out.println("Enter radius");
					double radius = sc.nextDouble();
					Shape circle = new Circle(radius);
					circle.size();
					break;
				
				case 2: 
					System.out.println("Enter length");
					double length = sc.nextDouble();
					Shape square = new Square(length);
					square.size();
					break;
				
					
				case 3: 
					System.out.println("Enter length");
					double lengthRect = sc.nextDouble();
					System.out.println("Enter width");
					double widthRect = sc.nextDouble();
					Shape rectangle = new Rectangle(lengthRect,widthRect);		
					rectangle.size();
					break;
				case 4: 
					System.out.println("Tata bye bye khatam");
					break loop;
				default: 
					System.out.println("Choose right way");
				}
			}
		}
	}
}
