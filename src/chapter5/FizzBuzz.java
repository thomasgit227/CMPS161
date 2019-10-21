package chapter5;

/*
 * Thomas Floyd (W#0699719)
 * CMPS 161_05
 * Dr. Bonnie Achee
 * October 21, 2019
 * 
 * Summary: 
 * Prints Numbers from 1 - 100. For multiples of 3, "Fizz" is printed instead
 * of the number. For multiples of 5, "Buzz" is printed instead of the number. 
 * For numbers divisible by both, "FizzBuzz" is printed instead of the number. These
 * numbers should be printed in rows of 10. The Strings "Fizz" and "Buzz" can be
 * changed per the users liking, as well as the length of the sequence and the numbers printed 
 * per line.
 */

public class FizzBuzz {
	public static void main(String[] args) {
		//Preferences
		int n = 100; //Length of Sequence
		int itemsPerLine = 10;
		String three = "Fizz";
		String five = "Buzz";
		
		//Main Iterator
		for(int i =1; i <= n; i++) {
			
			//FizzBuzz
			if(i % 15 == 0) {
				System.out.printf("%s, ", three+five);
			}
			else if(i % 5 == 0) {
				System.out.printf("%s, ", five);
			}
			else if(i % 3 == 0) {
				System.out.printf("%s, ", three);
			}
			else {
				System.out.printf("%d, ",i);
			}
			
			//Newline after 10 numbers
			if(i % itemsPerLine == 0) {
				System.out.print("\n");
			}
		}
	}
}
