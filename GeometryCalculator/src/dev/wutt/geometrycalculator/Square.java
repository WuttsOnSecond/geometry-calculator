package dev.wutt.geometrycalculator;

public class Square implements Shape {
	private double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	@Override
	public double area() {
		return Math.pow(side, 2);
	}
	
	@Override
	public String toString() {
		return "The area of the square with side length " + side + " is: " + area();
	}

}
