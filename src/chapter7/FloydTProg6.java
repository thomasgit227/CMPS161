package chapter7;

import java.util.Scanner;

/*
 * Thomas Floyd (W#0699719)
 * CMPS 161_05
 * Dr. Bonnie Achee
 * November 2, 2019
 * 
 * Summary: 
 *	Takes the user input list of students and scores after a specified number of students
 *	is given. This information is stored in 2 arrays (names & scores). The user is then
 *	given a text-based menu to select various options to manipulate this data. (The options
 *	are: List in Ascending or Descending Order, Change a Score, Find a Score, Display the
 *	class average score, find who is below or above the average). All of these options
 *	are contained in their respective method. The menu options repeat until "Exit" is 
 *	typed. The User is not allowed to search for students that are not there. 
 */

public class FloydTProg6 {
	
	public static String[] names;
	public static double[] scores;
	public static Scanner keys = new Scanner(System.in);
	public static String currentChoice = "";
	
	public static void main(String[] args) {
		
		//Initial Data
		welcomeMessage();
		promptEnterData();
		
		//Main Loop
		while(!currentChoice.equals("Exit")) {
			printMenuOptions();
			keys.nextLine();
			currentChoice = keys.nextLine();
			runOption();
		}
		
		//End
		keys.close();

	}
	
	//Welcome!
	public static void welcomeMessage() {
		System.out.println("Welcome to the Student Score Reporter!");
		System.out.println("*------------------------------------*");
	}
	
	//Initial Data Entry
	public static void promptEnterData() {
		System.out.println("Please Enter the Number of Students?");
		int studentAmount = keys.nextInt();
		names = new String [studentAmount];
		scores = new double [studentAmount];
		
		for(int i = 0; i < studentAmount; i++) {
			System.out.printf("Please Enter Student %d's name \n", i+1);
			names[i] = keys.next();
			keys.nextLine();
			System.out.printf("Please Enter %s's score \n", names[i]);
			scores[i] = keys.nextDouble();
		}
		
	}
	
	//Gives all Options
	public static void printMenuOptions() {
		System.out.println("Please Type an Option...");
		System.out.print("Ascending Order | Descending Order | Change Score\n"
						+ "Find Score | Class Average | Above Average Scores\n"
						+ "Below Average Scores | Exit\n");
	}
	
	public static void runOption() {
		if(currentChoice.equals("Ascending Order")) {
			sortAscending();
			printStudents(names);
		}
		else if(currentChoice.equals("Descending Order")) {
			sortDescending();
			printStudents(names);
		}
		else if(currentChoice.equals("Change Score")) {
			scoreChange();
		}
		else if(currentChoice.equals("Find Score")) {
			findScore();
		}
		else if(currentChoice.equals("Class Average")) {
			System.out.println("Class Average is " + classAverage());
		}
		else if(currentChoice.equals("Above Average Scores")) {
			aboveAverage();
		}
		else if(currentChoice.equals("Below Average Scores")) {
			belowAverage();
		}
		else if(currentChoice.equals("Exit")) {
			System.out.println("Have a Great Day");
			System.exit(1);
		}
		else {
			System.out.println("Invalid Input, please try again...");
		}
	}

	//Sorts Both Arrays in Ascending Order
	public static void sortAscending() {
		//Selection Sort
		if(scores.length != 0) {
			for(int i = 0; i < scores.length; i++) {
				for(int j = i; j < scores.length; j++) {
					if(scores[j] < scores[i]) {
						//Swap
						double tempNum = scores[i];
						scores[i] = scores[j];
						scores[j] = tempNum;
						String tempStr = names[i];
						names[i] = names[j];
						names[j] = tempStr;
					}
				}
			}
		}
	}
	
	//Sorts Both Arrays in Descending Order
	public static void sortDescending() {
		//Selection Sort
		if(scores.length != 0) {
			for(int i = 0; i < scores.length; i++) {
				for(int j = i; j < scores.length; j++) {
					if(scores[j] > scores[i]) {
						//Swap
						double tempNum = scores[i];
						scores[i] = scores[j];
						scores[j] = tempNum;
						String tempStr = names[i];
						names[i] = names[j];
						names[j] = tempStr;
					}
				}
			}
		}	
	}
	
	//Linear Search for Student, then Replace's Score w/ User Input
	public static void scoreChange() {
		System.out.println("Please Enter the Student's Name: ");
		String searchFor = keys.next();
		int i = findStudent(searchFor);
		
		if(i < 0) {
			System.out.println("Student Not Found Please Try Again");
		}
		else {
			System.out.println("What Would You Like the Score to be? ");
			double newScore = keys.nextDouble();
			scores[i] = newScore;
		}
	}
	
	//Linear Search for Student, Score is Outputted
	public static void findScore() {
		System.out.println("Please Enter the Student's Name: ");
		String searchFor = keys.next();
		int i = findStudent(searchFor);
		
		if(i < 0) {
			System.out.println("Student Not Found Please Try Again");
		}
		else {
			System.out.println("The Student's Score is " + scores[i]);
		}
	}
	
	//Linear Search through Name Array
	public static int findStudent(String name) {
		for(int i = 0; i < names.length; i++) {
			if(names[i].equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	//Returns Class Average
	public static double classAverage() {
		double avg = 0;
		
		for(int i = 0; i < scores.length; i++) {
			avg += scores[i];
		}
		avg /= scores.length;
		return avg;
	}
	
	//Print Students Above Average
	public static void aboveAverage() {
		System.out.println("The following students have Scores Above the Average: ");
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] > classAverage()) {
				System.out.println(names[i]);
			}
		}
	}
	
	//Print Students Below Average
	public static void belowAverage() {
		System.out.println("The following students have Scores Below the Average: ");
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] < classAverage()) {
				System.out.println(names[i]);
			}
		}
	}
	
	//Prints all Elements
	public static void printStudents(String[] printedArray) {
		System.out.print("Students: ");
		
		if(printedArray.length != 0) {
			System.out.print(printedArray[0]);
			for(int i = 1; i < printedArray.length; i ++) {
				if(printedArray.length == 2) {
					break;
				}
				System.out.print(", " + printedArray[i]);
			}
		}
		System.out.print("\n");
	}
}
