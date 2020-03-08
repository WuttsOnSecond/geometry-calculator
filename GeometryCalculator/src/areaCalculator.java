import java.util.InputMismatchException;
import java.util.Scanner;

/**
* This is a simple area calculator that returns  
* the surface area of selected shapes
*
* @author  Nicholas
*/

public class areaCalculator {
	
	public static void main(String[] args) {
		
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
						shapes.square(keyboard);
						break;
						
					case 2:
						shapes.rectangle(keyboard);
						break;
						
					case 3:
						shapes.triangle(keyboard);
						break;
						
					case 4: 
						shapes.circle(keyboard);
						break;
						
					case 5:
						shapes.trapezoid(keyboard);
						break;
						
					case 6: 
						shapes.rhombus(keyboard);
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