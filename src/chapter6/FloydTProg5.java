package chapter6;

import java.util.Scanner;

/*
 * Thomas Floyd (W#0699719)
 * CMPS 161_05
 * Dr. Bonnie Achee
 * November 18, 2019
 * 
 * Summary: 
 * 	This program will collect a String via the Scanner class and then perform
 * 	various analysis' of this string. Each analysis of the String will be selected
 * 	also via Scanner class by the user. This will continue until the user selects
 * 	the "exit" option. The options available will be methods declared in this
 * 	program and are: countVowels, countConsonants, countLowercase, printEvenChars,
 * 	and printOddChars.
 *
 */

public class FloydTProg5 {
	//Declaration
	public static Scanner keys = new Scanner(System.in); //Scanner to Collect Info
	public static String input = ""; //String to be processed
	public static boolean isExiting = false; //Checked to see if user exits program
	
	public static void main(String[] args) {
		//Initial Prompt
		System.out.println("Please Enter a String");
		input = keys.nextLine();
		
		//Repeated Code
		do {
			char userChoice = getChoice();
			runOption(userChoice);
		}
		while(!isExiting);
		
		//Scanner Close
		keys.close();
	}
	
	public static char getChoice() {
		//Prompt
		System.out.println("**Select an Option (Enter one of the phrases Below)**");
		System.out.print("\"Count Vowels\" | " +
						"\"Count Consonants\" | " +
						"\"Count Lowercase\" | " +
						"\"Count Uppercase\" \n" +
						"\"Print Even Chars\" | " +
						"\"Print Odd Chars\" | " +
						"\"Exit\"\n");
		String optionString = keys.nextLine();
		
		//Convert to String for Switch / Check for Proper Choice
		char option = 0;
		if(optionString.equals("Count Vowels")) {
			option = 'v';
		}
		else if(optionString.equals("Count Consonants")) {
			option = 'c';
		}
		else if(optionString.equals("Count Lowercase")) {
			option = 'l';
		}
		else if(optionString.equals("Count Uppercase")) {
			option = 'u';
		}
		else if(optionString.equals("Print Even Chars")) {
			option = 'e';
		}
		else if(optionString.equals("Print Odd Chars")) {
			option = 'o';
		}
		else if(optionString.equals("Exit")) {
			option = 's';
		}
		else {
			System.out.println("PLEASE ENTER A PROPER CHOICE!");
			getChoice();
		}
		
		return option;
	}
	public static void runOption(char userChoice) {
		//Runs the Proper Method
		switch(userChoice) {
		
		case 'v': System.out.printf("The String Contains %d Vowels \n\n", countVowels(input));
			break;
			
		case 'c': System.out.printf("The String Contains %d Consonants \n\n", countConsonants(input));
			break;
		
		case 'l': System.out.printf("The String Contains %d Lowercase Chars \n\n", countLowercase(input));
			break;
			
		case 'u': System.out.printf("The String Contains %d Uppercase Chars \n\n", countUppercase(input));
			break;
			
		case 'e': printEvenChars(input);
			break;
			
		case 'o': printOddChars(input);
			break;
		
		case 's': System.out.println("Goodbye");
		default:
			System.exit(1);
		}
	}
	
//String Parsing Methods
	public static int countVowels(String s) {
		int total = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.toLowerCase().charAt(i) == 'a') {
				total++;
			}
			else if(s.toLowerCase().charAt(i) == 'e') {
				total++;
			}
			else if(s.toLowerCase().charAt(i) == 'i') {
				total++;
			}
			else if(s.toLowerCase().charAt(i) == 'o') {
				total++;
			}
			else if(s.toLowerCase().charAt(i) == 'u') {
				total++;
			}
			else if(s.toLowerCase().charAt(i) == 'y') {
				total++;
			}
		}
		return total;
	}
	
	public static int countConsonants(String s) {
		int total = 0;
		String lowerS = s.toLowerCase();
		for(int i = 0; i < lowerS.length(); i++) {
			if((lowerS.charAt(i) > 97) && (101 > lowerS.charAt(i))) {
				total++;
			}
			else if((lowerS.charAt(i) > 101) && (105 > lowerS.charAt(i))) {
				total++;
			}
			else if((lowerS.charAt(i) > 105) && (111 > lowerS.charAt(i))) {
				total++;
			}
			else if((lowerS.charAt(i) > 111) && (117 > lowerS.charAt(i))) {
				total++;
			}
			else if((lowerS.charAt(i) > 117) && (121 > lowerS.charAt(i))) {
				total++;
			}
			else if (lowerS.charAt(i) == 122) {
				total++;
			}
		}
		
		return total;
	}
	
	public static int countLowercase(String s) {
		int total = 0;
		for(int i = 0; i < s.length(); i++) {
			if((s.charAt(i) >= 97) && (s.charAt(i) <= 122)) {
				total ++;
			}
		}
		return total;
	}
	
	public static int countUppercase(String s) {
		int total = 0;
		for(int i = 0; i < s.length(); i++) {
			if((s.charAt(i) >= 65) && (s.charAt(i) <= 90)) {
				total ++;
			}
		}
		return total;
	}
	
	public static void printEvenChars(String s) {
		String out = "";
		
		for(int i = 0; i < s.length(); i++) { 
			if((i - 1) % 2 == 0) {
				out += s.charAt(i);
			}
		}
		
		System.out.println(out + "\n");
	}
	
	public static void printOddChars(String s) {
		String out = "";
		
		for(int i = 0; i < s.length(); i++) { 
			if((i - 1) % 2 != 0) {
				out += s.charAt(i);
			}
		}
		
		System.out.println(out + "\n");
	}
}
