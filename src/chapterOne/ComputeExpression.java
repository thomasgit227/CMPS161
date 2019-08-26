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
		double numerator = multiply(add(10.5,2), 3);
		double denominator = subtract(45, 3.5);
		double result = divide(numerator, denominator);
		
		System.out.println(result);
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
