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
		
		//Limits Domain of choices to [0-4]
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
		
		//User has Rock
		case 0:
			if(machineHand == 0) { //Machine has Rock
				System.out.println("Rock does not effect Rock");
				System.out.println("DRAW");
			}
			else if(machineHand == 1) { //Machine has Paper
				System.out.println("Paper covers Rock");
				System.out.println("MACHINE WINS");
			}
			else if(machineHand == 2) { //Machine has Scissors
				System.out.println("Rock destroys Scissors");
				System.out.println("USER WINS");
			}
			else if(machineHand == 3) { //Machine has Lizard
				System.out.println("Rock crushes Lizard");
				System.out.println("USER WINS");
			}
			else { //Machine has Spock
				System.out.println("Spock vaporizes Rock");
				System.out.println("MACHINE WINS");
			}
			break;
			
		//User has Paper
		case 1:
			if(machineHand == 0) { //Machine has Rock
				System.out.println("Paper covers Rock");
				System.out.println("USER WINS");
			}
			else if(machineHand == 1) { //Machine has Paper
				System.out.println("Paper does not effect Paper");
				System.out.println("DRAW");
			}
			else if(machineHand == 2) { //Machine has Scissors
				System.out.println("Scissors cuts Paper");
				System.out.println("MACHINE WINS");
			}
			else if(machineHand == 3) { //Machine has Lizard
				System.out.println("Lizard eats Paper");
				System.out.println("MACHINE WINS");
			}
			else { //Machine has Spock
				System.out.println("Paper disproves Spock");
				System.out.println("USER WINS");
			}
			break;
			
		//User has Scissors
		case 2:
			if(machineHand == 0) { //Machine has Rock
				System.out.println("Rock destroys Scissors");
				System.out.println("MACHINE WINS");
			}
			else if(machineHand == 1) { //Machine has Paper
				System.out.println("Scissors cuts Paper");
				System.out.println("USER WINS");
			}
			else if(machineHand == 2) { //Machine has Scissors
				System.out.println("Scissors does not effect Scissors");
				System.out.println("DRAW");
			}
			else if(machineHand == 3) { //Machine has Lizard
				System.out.println("Scissors kill Lizard");
				System.out.println("USER WINS");
			}
			else { //Machine has Spock
				System.out.println("Spock disassembles Scissors");
				System.out.println("MACHINE WINS");
			}
			break;
			
		//User has Lizard
		case 3:
			if(machineHand == 0) { //Machine has Rock
				System.out.println("Rock crushes Lizard");
				System.out.println("MACHINE WINS");
			}
			else if(machineHand == 1) { //Machine has Paper
				System.out.println("Lizard eats Paper");
				System.out.println("USER WINS");
			}
			else if(machineHand == 2) { //Machine has Scissors
				System.out.println("Scissors kill Lizard");
				System.out.println("MACHINE WINS");
			}
			else if(machineHand == 3) { //Machine has Lizard
				System.out.println("Lizards...why did have to be Lizards?");
				System.out.println("DRAW");
			}
			else { //Machine has Spock
				System.out.println("Lizard poisons Spock");
				System.out.println("USER WINS");
			}
			break;
			
		//User has Spock \\//
		case 4:
			if(machineHand == 0) { //Machine has Rock
				System.out.println("Spock vaporizes Rock");
				System.out.println("USER WINS");
			}
			else if(machineHand == 1) { //Machine has Paper
				System.out.println("Paper disproves Spock");
				System.out.println("MACHINE WINS");
			}
			else if(machineHand == 2) { //Machine has Scissors
				System.out.println("Spock disassembles Scissors");
				System.out.println("USER WINS");
			}
			else if(machineHand == 3) { //Machine has Lizard
				System.out.println("Lizard poisons Spock");
				System.out.println("MACHINE WINS");
			}
			else { //Machine has Spock
				System.out.println("Spock proves alternate realities exist beyond "
						+ "the mirror universe (first discoverd in the episode "
						+ "\"in a mirror, darkly\". )");
				System.out.println("DRAW");
			}
			break;
			
		//Exit Status 1
		default:
			System.exit(1);
		}
	}
}
