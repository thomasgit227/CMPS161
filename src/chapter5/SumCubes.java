package chapter5;

/*
 * Thomas Floyd (W#0699719)
 * CMPS 161_05
 * Dr. Bonnie Achee
 * October 21, 2019
 * 
 * Summary: 
 * Sums the cubed value of the numbers from 1 to n 
 * Also returns all odd numbers cubed from 1 to n
 */

public class SumCubes {
	public static void main(String[] args) {
		
		int n = 50;
		int total = 0;
		int oddTotal = 0;
		
		for(int k = 1; k <= n; k++) {
			total += Math.pow(k,3);
		}
		System.out.printf("The Sum of the First %d cubes is %d \n", n, total);
		
		for(int k = 1; k <= n; k+=2) {
			oddTotal += Math.pow(k,3);
		}
		System.out.printf("The Sum of the First %d odd cubes is %d \n", n, oddTotal);
	}	
}
