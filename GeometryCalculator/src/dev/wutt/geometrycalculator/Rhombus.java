package dev.wutt.geometrycalculator;

public class Rhombus implements Shape {
	private double base, height;
	
	public Rhombus(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double area() {
		return base * height;
	}
	
	@Override 
	public String toString() {
		return "The area of the rhombus with base " + base + " and height " + height + " is " + area();
	}
	
}