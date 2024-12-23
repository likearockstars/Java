package entities;

import entities.enums.Color;

public class Rectangle extends Shape{

	private Double width;
	private Double height;
	
	public Rectangle() {
	}
	
	public Rectangle(Double width, Double height, Color color) {
		
		super(color);
		this.width = width;
		this.height = height;
	}
	
	public void setWidth(Double width) {
		
		this.width = width;
		
	}
	
	public Double getWidth() {
		
		return width;
	
	}
	
	public void setHeight(Double heigth) {
		
		this.height = heigth;
	}
	
	public Double getHeight() {
		
		return height;
	}
	
	
	public double area() {
		
		return width * height; 
	}

}
