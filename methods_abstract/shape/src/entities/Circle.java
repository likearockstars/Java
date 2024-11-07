package entities;

import entities.enums.Color;

public class Circle extends Shape {
	
	private Double radius;
	private static final double PI = 3.1459;
	
	public Circle() {
		super();
	}
	
	public Circle(Color color,Double radius) {
		
		super(color);
		setRadius(radius);
	}
	
	public void setRadius(Double radius) {
		
		this.radius = (radius > 0.0) ? radius : 0.0;
	}
	
	public double area() {
		
		return radius * radius * PI;
	}

}
