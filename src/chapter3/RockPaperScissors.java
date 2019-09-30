package chapter3;
import java.util.Scanner;

/*
 * Thomas Floyd (W#0699719)
 * CMPS 161_05
 * Dr. Bonnie Achee
 * September 30, 2019
 * 
 * Summary: 
 * Plays Stone, Papyrus, Sword against the machine. The opponent's hand is determined
 * by a random number. Winner is determined via Switch Case statement and if/else statement
 */

public class RockPaperScissors {
	public static void main(String[] args) {
		
		//Declaration for Program
		Scanner user = new Scanner(System.in);
		int userHand;
		int machineHand = (int)(Math.random() * 3);
		
		//Prompt
		System.out.println("Stone..., \nPapyrus..., \nSword,......, \nMUSKET!");
		System.out.println("Enter 0 for Stone, Enter 1 for Papyrus, Enter 2 for Sword");
		userHand = user.nextInt()%3; //Limits Domain to [0,2]
		
		//Winner Determination
		
		switch(userHand) {
		case 0:
			if(machineHand == 0) {
				System.out.println("DRAW");
			}
			else if(machineHand == 1) {
				System.out.println("MACHINE WINS");
			}
			else {
				System.out.println("USER WINS");
			}
			break;
		case 1:
			if(machineHand == 0) {
				System.out.println("USER WINS");
			}
			else if(machineHand == 1) {
				System.out.println("DRAW");
			}
			else {
				System.out.println("MACHINE WINS");
			}
			break;
		case 2:
			if(machineHand == 0) {
				System.out.println("MACHINE WINS");
			}
			else if(machineHand == 1) {
				System.out.println("USER WINS");
			}
			else {
				System.out.println("DRAW");
			}
			break;
		default:
			System.exit(1);
		}
	}
}
