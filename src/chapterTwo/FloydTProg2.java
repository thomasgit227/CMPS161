package chapterTwo;
import java.util.Scanner;
/*
 * Thomas Floyd (W#0699719)
 * CMPS 161_05
 * Dr. Bonnie Achee
 * September 16, 2019
 * 
 * Summary: 
 * 
 */

public class FloydTProg2 {
	
	public static void main(String[] args) {
		//Scanner Object
		Scanner user = new Scanner(System.in);
		//Variable Declaration
		double x1, x2, x3;
		double y1, y2, y3;
		double area;
		
		//Find Coordinate 1
		System.out.println("Please Enter your First X Coordinate: ");
		x1 = user.nextDouble();
		System.out.println("Please Enter your First Y Coordinate: ");
		y1 = user.nextDouble();
		
		//Find Coordinate 2
		System.out.println("Please Enter your Second X Coordinate: ");
		x2 = user.nextDouble();
		System.out.println("Please Enter your Second Y Coordinate: ");
		y2 = user.nextDouble();
		
		//Find Coordinate 3
		System.out.println("Please Enter your Last X Coordinate: ");
		x3 = user.nextDouble();
		System.out.println("Please Enter your Last Y Coordinate: ");
		y3 = user.nextDouble();
		
		//Close Scanner
		user.close();
		
		//Return Coordinates
		System.out.println("Your Coordinates Are: ");
		System.out.println("(" + x1 + ", " + y1 + ")");
		System.out.println("(" + x2 + ", " + y2 + ")");
		System.out.println("(" + x3 + ", " + y3 + ")");
		
		//Compute Sides using Distance Formula
		double side1 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		double side2 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
		double side3 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
		
		//Return Side Lengths
		System.out.println("Side 1 = " + side1 + " units");
		System.out.println("Side 2 = " + side2 + " units");
		System.out.println("Side 3 = " + side3 + " units");
		
		//Compute Area
		double s = (side1 + side2 + side3)/2;
		area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		//Truncate Area
		double castedArea = (int)(area * 100);
		area = castedArea / 100;
		System.out.println("Area = " + area + " units^2");
	}

}
