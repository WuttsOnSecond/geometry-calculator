package dev.wutt.geometrycalculator;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
* This is a simple area calculator that returns  
* the surface area of selected shapes 
*
* @author  Nicholas
*/

public class Main {
	
	public static void main(String[] args) {
		//staticShapes();
		
		Square square = new Square(4);
		System.out.println(square);
		
		System.out.println();
		Rectangle rectangle = new Rectangle(5, 4);
		System.out.println(rectangle);
		
		System.out.println();
		Circle circle = new Circle(7);
		System.out.println(circle);
		
		System.out.println();
		Trapezoid trapezoid = new Trapezoid(4, 3, 4);
		System.out.println(trapezoid);
		
		System.out.println();
		Rhombus rhombus = new Rhombus(5, 4);
		System.out.println(rhombus);
		
		System.out.println();
		Rhombus rhombusAlt = new Rhombus(6, 7);
		System.out.println(rhombusAlt);
	}
	
	static void staticShapes() {
		int shapeNum;
		String newLine = System.lineSeparator();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to simple area calculator!");
		System.out.println("Please enter the number representing your shape: " + newLine);
		
		System.out.println("1 - square" + newLine + 
						   "2 - rectangle" + newLine +
						   "3 - triangle" + newLine + 
						   "4 - circle" + newLine +
						   "5 - trapezoid" + newLine + 
						   "6 - rhombus" + newLine);
		
		// checking input for errors
		try {
			shapeNum = keyboard.nextInt();
			if (shapeNum > 0 && shapeNum < 7) {
				//System.out.println("shapeNum = " + shapeNum);
				
				switch (shapeNum) {
					case 1: 
						Shapes.square(keyboard);
						break;
						
					case 2:
						Shapes.rectangle(keyboard);
						break;
						
					case 3:
						Shapes.triangle(keyboard);
						break;
						
					case 4: 
						Shapes.circle(keyboard);
						break;
						
					case 5:
						Shapes.trapezoid(keyboard);
						break;
						
					case 6: 
						Shapes.rhombus(keyboard);
						break;
				}
				
			}
			
			else System.out.println("Invalid number.  Try again. ");
		}
		
		catch (InputMismatchException e) {
			System.out.println("Invalid number.  Try again. ");
		}
		
	}
		
}