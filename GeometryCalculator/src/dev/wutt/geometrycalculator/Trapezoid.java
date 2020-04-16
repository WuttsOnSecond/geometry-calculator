package dev.wutt.geometrycalculator;

public class Trapezoid implements Shape {
	private double b1, b2, height;
	
	public Trapezoid(double b1, double b2, double height) {
		this.b1 = b1;
		this.b2 = b2;
		this.height = height;
	}
	
	@Override
	public double area() {
		return height * ((b1 + b2)/2);
	}
	
	@Override 
	public String toString() {
		return "The area of the triangle with bases " + b1 + ", " + b2 + " and height " + height + " is " + area();
	}

}
