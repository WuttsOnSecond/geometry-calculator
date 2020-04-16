package dev.wutt.geometrycalculator;

public class Triangle implements Shape {
	private double base, height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double area() {
		return (base * height)/2;
	}
	
	@Override
	public String toString() {
		return "The area of the triangle with base " + base + " and height " + height + " is: " + area();
	}

}
