package chapter1;

/*
 * Thomas Floyd (W#0699719)
 * CMPS 161_05
 * Dr. Bonnie Achee
 * August 28, 2019
 * 
 * Summary: 
 * This automatically calculates the Area and Circumference of a circle.
 * The methods calculateArea(double r), and calculateCircum(double r) have a double parameter to represent "radius" 
 * These methods will return a calculated Double, and that value is what is being printed to the Console. 
 * To change the Radius of the circle, change the variable "mRadius" which is declared before the main method.
 * Program ignores negative radii.
 */

public class FloydTProg1 {
	
	//Constant for Pi taken from "Math" library
	static final double PI = Math.PI;

	//User-Given Radius
	static double mRadius = 5.5;
	
	public static void main(String[] args) {
		fixNegativeRadii();
		System.out.println("For a Circle with Radius " + mRadius + " cm");
		System.out.println("The Area will be " + calculateArea(mRadius) + " cm^2");
		System.out.println("The Circumference will be " + calculateCircum(mRadius) + " cm");
	}
	
	//Takes the Absolute Value of mRadius to ignore negative measurements
	public static void fixNegativeRadii() {
		mRadius = Math.abs(mRadius);
	}
	
	//Area is returned as PI * r^2
	public static double calculateArea(double r) {
		return Math.pow(r, 2) * PI;
	}
	
	//Circumference is returned as 2 * PI * r
	public static double calculateCircum(double r) {
		return 2 * PI * r;
	}
}
