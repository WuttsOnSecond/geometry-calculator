package dev.wutt.geometrycalculator;

public class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "The area of the circle with radius " + radius + " is " + area();
	}
}
