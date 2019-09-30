package chapter2;
import java.util.Scanner;

/*
 * Thomas Floyd (W#0699719)
 * CMPS 161_05
 * Dr. Bonnie Achee
 * September 11, 2019
 * 
 * Summary: 
 * This program uses a scanner to take the purchase amount from the user.
 * The purchased amount is then taxed according to the tax declared in the beginning
 * of the class. Finally, that taxed amount is rounded to 2 decimal places and 
 * accounts for the thousandth digit so it will round accordingly.
 */

public class Purchase {
	
	public static double tax = .09;
	public static double purchaseAmount = 0;
	
	public static void main(String[] args) {
		askPrice();
		taxPrice();
		System.out.println("Your final amount is $" + computeTwoDecimalPrice(purchaseAmount));
	}
	
	public static void askPrice() {
		System.out.println("How much? ");
		Scanner keys = new Scanner(System.in);
		purchaseAmount = keys.nextDouble();
		keys.close();
	}
	
	public static void taxPrice() {
		purchaseAmount *= (1 + tax);
		System.out.println("Your Raw Taxed Price is $" + purchaseAmount);
	}
	
	public static double computeTwoDecimalPrice(double input) {
		int thousandthsDigit = (int) ((input * 1000) % 10);
		
		if(thousandthsDigit >= 5) {
			input += .01;
		}
		
		int expanded = (int)(input*100);
		return (double)expanded/100;
	}
}
