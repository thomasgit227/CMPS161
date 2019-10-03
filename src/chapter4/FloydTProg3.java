package chapter4;
import java.util.Scanner;

/*
 * Thomas Floyd (W#0699719)
 * CMPS 161_05
 * Dr. Bonnie Achee
 * September 30, 2019
 * 
 * Summary: 
 * Plays Rock, Paper, Scissors, Lizard, Spock. The opponent's hand is determined
 * by a random number. Winner is determined via Switch Case statement and if/else statement
 */

public class FloydTProg3 {
	public static void main(String[] args) {
		
		//Declaration for Program
		Scanner user = new Scanner(System.in);
		int userHand;
		int machineHand = (int)(Math.random() * 5);
		
		//Prompt User
		System.out.println("Rock, Paper, Scissors, Lizard, Spock!");
		System.out.println("Please Enter Your Hand \n"
							+ "0 = Rock \n"
							+ "1 = Paper \n"
							+ "2 = Scissors \n"
							+ "3 = Lizard \n"
							+ "4 = Spock");
		
		userHand = user.nextInt();
		if(userHand > 4 || userHand < 0) {
			System.out.println("Please Use one of the Choices Above");
			System.exit(1);
		}
		user.close();
		
		//Choices Revealed TODO: this will be put in the switch soon
		System.out.println("User : " +  userHand);
		System.out.println("Machine : " + machineHand);
		
		//Winner Determination	
		switch(userHand) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
			
		//Exit Status 1
		default:
			System.exit(1);
		}
	}
}
