package chapter6;

/*
 * Thomas Floyd (W#0699719)
 * CMPS 161_05
 * Dr. Bonnie Achee
 * October 30, 2019
 * 
 * Summary: 
 * Runs a Summation method which has endpoint parameters
 */

public class ComputeSumOfDigits {
	
	public static void main(String[] args) {
		int start = 1;
		int end = 10;
		System.out.printf("The Summation from %d to %d is %d",start, end, summation(start, end));
	}
	
	public static int summation(int start, int end) {
		int sum = 0;
		
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		return sum;
	}
}
