package dev.wutt.geometrycalculator;
import java.util.Scanner;

// Static class implementation
public class Shapes {
	
	public static void square(Scanner sc) {
		System.out.println("Enter a side of the square: ");
		double side = sc.nextDouble();
		System.out.println("Area of square: " + Math.pow(side, 2));
	}
	
	public static void rectangle(Scanner sc) {
		System.out.println("Enter the width and height of your rectangle: ");
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		System.out.println("Area of rectangle: " + width * height);
	}
	
	public static void  triangle(Scanner sc) {
		System.out.println("Enter the base and height of your triangle: ");
		double base = sc.nextDouble();
		double height = sc.nextDouble();
		System.out.println("Area of triangle: " + 0.5 * base * height);
	}
	
	public static void circle(Scanner sc) {
		System.out.println("Enter the radius of your circle: ");
		double radius = sc.nextDouble();
		System.out.println("Area of circle: " + Math.PI * Math.pow(radius, 2));
	}
	
	public static void trapezoid(Scanner sc) {
		System.out.println("Enter the height of your trapezoid then both bases: ");
		double height = sc.nextDouble();
		double b1 = sc.nextDouble();
		double b2 = sc.nextDouble();
		System.out.println("Area of trapezoid: " + (height * ((b1 + b2)/2)));
	}
	
	public static void rhombus(Scanner sc) {
		System.out.println("Enter the width and height of your rhombus: ");
		double base = sc.nextDouble();
		double height = sc.nextDouble();
		System.out.println("Area of rhombus: " + base * height);
	}
	
}
