package chapter7;
import java.util.Scanner;

/*
 * Thomas Floyd (W#0699719)
 * CMPS 161_05
 * Dr. Bonnie Achee
 * November 6, 2019
 * 
 * Summary: 
 * Mimics a Magic-8-Ball, play as long as the user wishes
 */

public class MagicEightBall {
	
	private static Scanner keys = new Scanner(System.in);
	private static boolean playAgain = true;
	private static String input;
	
	public static void main(String[] args) {
		while(playAgain) {
			startingPrompt();
			generateAnswer();
			playAgain = getPlayAgain();
		}
	}
	
	public static void startingPrompt() {
		System.out.println("Ask the Racially Ambiguous Eight Ball a Question...");
		input = keys.nextLine();
	}
	
	public static void generateAnswer() {
		System.out.printf("The Racially Ambiguous Eight Ball says \"%s\" \n", getRandomAnswer());
	}
	
	public static boolean getPlayAgain() {
		System.out.println("Do you want to play again? ( y / n )");
		String yn = keys.nextLine();
		
		if(yn.equals("y")) {
			return true;
		}
		else if(yn.equals("n")) {
			return false;
		}
		else {
			System.out.println("Address the Racially Ambiguous Eight Ball properly!");
			return false;
		}
	}
	public static String getRandomAnswer() {
		
		int rand = (int)(Math.random() * 20);
		String output = "";
		
		switch(rand) {
		case 0: output = "It is certain.";
		break;
		
		case 1: output = "It is decidedly so.";
		break;
		
		case 2: output = "Without a doubt.";
		break;
		
		case 3: output = "Yes - definitely.";
		break;
		
		case 4: output = "You may rely on it.";
		break;
		
		case 5: output = "As I see it, yes.";
		break;
		
		case 6: output = "Most likely.";
		break;
		
		case 7: output = "Outlook good.";
		break;
		
		case 8: output = "Yes.";
		break;
		
		case 9: output = "Signs point to yes.";
		break;
		
		case 10: output = "Reply hazy, try again.";
		break;
		
		case 11: output = "Ask again later.";
		break;
		
		case 12: output = "Better not tell you now.";
		break;
		
		case 13: output = "Cannot predict now.";
		break;
		
		case 14: output = "Concentrate and ask again.";
		break;
		
		case 15: output = "Don't count on it.";
		break;
		
		case 16: output = "My reply is no.";
		break;
		
		case 17: output = "My sources say no.";
		break;
		
		case 18: output = "Outlook not so good.";
		break;
		
		case 19: output = "Very doubtful.";
		break;
		
		default:
			return "";
		}
		return output;
	}
}
