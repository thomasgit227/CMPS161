/*******************************************************************************
 * Thomas Floyd (W#0699719)
 * CMPS 161_05
 * Dr. Bonnie Achee
 * August 26, 2019
 * This will compute some basic math
 ******************************************************************************/
package chapterOne;

public class ComputeExpression {
	public static void main(String[] args) {
		double preNumerator = multiply(2, 3); //PEMDAS Order is important, this multiplies whats in the Numerator first
		double numerator = add(preNumerator, 10.5); //This Finishes the Numerator Math
		double denominator = subtract(45, 3.5); //Denominator Math
		double result = divide(numerator, denominator); //Num / Den
		
		System.out.println(""); //Problem
		System.out.println("Your Result is... " + result); //Final Answer
	}

	private static double add(double a, double b) {
		return a+b;
	}
	
	private static double subtract(double a, double b) {
		return a-b;
	}
	
	private static double multiply(double a, double b) {
		return a*b;
	}
	
	private static double divide(double a, double b) {
		return a/b;
	}
}
