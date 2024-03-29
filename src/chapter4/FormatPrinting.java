package chapter4;

/*
 * Thomas Floyd (W#0699719)
 * CMPS 161_05
 * Dr. Bonnie Achee
 * September 30, 2019
 * 
 * Summary: 
 * printf examples
 */

public class FormatPrinting {
	public static void main(String[] args) {
		
		double num = 145.902343;
		
		System.out.printf("This %-2c, is a formatted char \n", 'z');
		System.out.printf("This is %b , and this is %6B \n", 45 > 52, true);
		System.out.printf("This is %d decimal format \n", (int)num);
		System.out.printf("This is %.2f floating point format \n", num);
		System.out.printf("This is %e scientific format \n", num);

	}
}
