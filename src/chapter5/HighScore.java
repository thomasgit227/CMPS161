package chapter5;
import java.util.Scanner;

/*
 * Thomas Floyd (W#0699719)
 * CMPS 161_05
 * Dr. Bonnie Achee
 * October 16, 2019
 * 
 * Summary: 
 * Determines a winner based on given scores. This was a bellringer but it contains
 * good loop stuff from chapter 5
 */

public class HighScore {
	public static void main(String[] args) {
		int highScore = Integer.MIN_VALUE;
		String winner = "";
		
		Scanner keys = new Scanner(System.in);
		System.out.println("Enter Student Amount");
		int amount = keys.nextInt();
		
		int count = 0;
		while(count < amount) {
			
			System.out.printf("Enter Student %d's name \n", count+1);
			String currentStudent = keys.next();
			
			System.out.printf("Enter %s's score \n", currentStudent);
			int currentScore = keys.nextInt();
			
			if(currentScore > highScore) {
				winner = currentStudent;
				highScore = currentScore;
			}
			count++;
		}
		
		System.out.printf("The Winner is %s with a score of %d! \n", winner, highScore);
		keys.close();
	}
}
