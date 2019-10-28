package chapter5;
import java.util.Scanner;

/*
 * Thomas Floyd (W#0699719)
 * CMPS 161_05
 * Dr. Bonnie Achee
 * October 23, 2019
 * 
 * Summary: 
 * 	Collects the below information from the user to generate a payroll.
 * 	Generates amount of payment based on hours worked, rate, and taxes. Parses 
 * 	name to generate a first and last name String. It will also use the name to
 * 	generate a random employee ID. Negative values and/or invalid tax brackets
 * 	return an error and exit the program. All monetary values will be returned with
 * 	2 digits behind the decimal
 * 
 * Collects:
 * 	User First and Last Name
 * 	# of Hours Worked
 * 	Hourly Pay Rate
 * 	Federal and State Tax Percentages 
 * 
 * Tax Brackets:
 * 	Invalid Tax Bracket inputs will exit the program
 * 
 *  Valid federal tax brackets are 10%, 12%, 22%, 24%, 32%, 35% and 37%
 *  Valid state tax brackets are 2%, 4% and 6%.
 *  
 * Sample:
 * 
 * 	-----------|EMPLOYEE|-----------
 * 	Last Name: Doe
 * 	First Name: John
 * 	ID: JD420
 * 	Hours Worked: 10 hours
 * 	Hourly Pay: $12.75
 * 	Gross Pay: $127.50
 * 	--------------|TAX|-------------
 *	Federal Withholding: (20%) $25.50
 * 	State Withholding: (7%) $8.93
 * 	Total Deductions: $34.43
 * 	------------|PAYMENT|-----------
 * 	Net Pay: $93.07
 * 	
 */

public class FloydTProg4 {
	public static void main(String[] args) {

	//Variable Declaration
		Scanner user = new Scanner(System.in);
		String first, last, userInput, employeeID = "";
		double hoursWorked, hourlyRate, federalTax, stateTax,
		grossPay, netPay, deductionTotal, deductionPercent  = 0.0;
		
	//Name Input
		//Prompt
		System.out.println("Please Enter Employee First & Last name (Ex. John Doe)");
		userInput = user.nextLine();
		
		//Check for Two Names
		if(!userInput.contains(" ")) {
			System.out.println("Please use the Proper Format for Employee Name");
			System.exit(1);
		}
		
		//Parses User Input
		first = userInput.substring(0, userInput.indexOf(" "));
		last = userInput.substring(userInput.indexOf(" ") + 1 , userInput.length());

		//ID Formation
		int threeNums = (int)(java.lang.System.currentTimeMillis() % 1000);
		employeeID = first.substring(0,1) + last.substring(0,1) + threeNums;
	
	//Hours & Gross Pay
		//Prompt (Hours Worked)
		System.out.println("How Many Hours did the Employee Work?");
		hoursWorked = user.nextDouble();
		
		//Hours Worked is Positive
		if(hoursWorked < 0) {
			System.out.println("Please Enter a Positive Number");
			System.exit(1);
		}

		//Prompt (Hours Worked)
		System.out.println("What is the Employee's Hourly Pay Rate?");
		hourlyRate = user.nextDouble();
		
		//Hourly Pay is Positive
		if(hourlyRate < 0) {
			System.out.println("Please Enter a Positive Number");
			System.exit(1);
		}
		
		//Calculates Gross Pay
		grossPay = hourlyRate * hoursWorked;
		
	//Tax Information
		//Prompt (Federal Tax)
		System.out.println("Please Enter Employee Federal Tax Bracket \n"
		+ "Enter Tax Bracket % Exactly as Listed here: 10, 12, 22, 24, 32, 35 or 37");
		federalTax = user.nextDouble();
		
		//Federal Tax is Positive
		if(federalTax < 0) {
			System.out.println("Please Enter a Positive Number");
			System.exit(1);
		}
		
		//Prompt (State Tax)
		System.out.println("Please Enter Employee State Tax Bracket \n"
		+ "Enter Tax Bracket % Exactly as Listed here: 2, 4 or 6");
		stateTax = user.nextDouble();
		
		//Federal Tax is Positive
		if(stateTax < 0) {
			System.out.println("Please Enter a Positive Number");
			System.exit(1);
		}
		
	//Deductions
		//Federal
		switch((int)federalTax) {
		case 10:
			deductionPercent += 0.10;
			break;
			
		case 12:
			deductionPercent += 0.12;
			break;
			
		case 22:
			deductionPercent += 0.22;
			break;
			
		case 24:
			deductionPercent += 0.24;
			break;
			
		case 32:
			deductionPercent += 0.32;
			break;
			
		case 35:
			deductionPercent += 0.35;
			break;
			
		case 37:
			deductionPercent += 0.37;
			break;
			
		default:
			System.out.println("Please Enter a Valid Federal Tax Bracket");
			System.exit(1);
			break;
		}
		
		//State
		switch((int)stateTax) {
		case 2:
			deductionPercent += 0.06;
			break;
			
		case 4:
			deductionPercent += 0.04;
			break;
			
		case 6:
			deductionPercent += 0.06;
			break;
	
		default:
			System.out.println("Please Enter a Valid State Tax Bracket");
			System.exit(1);
			break;
		}
		
	//End Scanner
		user.close();

	//Final Deduction & Net Calculations
		deductionTotal = (grossPay * deductionPercent);
		netPay = grossPay - (grossPay * deductionPercent);

	//Print Employee Payroll
		System.out.println("\n/////////////////////////");
		System.out.println("/  Printing Payroll...  /");
		System.out.println("/////////////////////////\n");
		
		System.out.println("*	-----------|EMPLOYEE|-----------");
		System.out.printf("*	Last Name: %s\n", last);
		System.out.printf("*	First Name: %s\n", first);
		System.out.printf("*	ID: %s\n", employeeID);
		System.out.printf("*	Hours Worked: %d Hrs\n", (int)hoursWorked);
		System.out.printf("*	Hourly Pay: $ %.2f\n", hourlyRate);
		System.out.printf("*	Gross Pay: $ %.2f\n", grossPay);
		
		System.out.println("* 	--------------|TAX|-------------");
		System.out.printf("*	Federal Withholding: (%d%%) $%.2f\n", (int)federalTax, (federalTax * .01) * grossPay);
		System.out.printf("*	State Withholding: (%d%%) $%.2f\n", (int)stateTax, (stateTax * .01) * grossPay);
		System.out.printf("*	Total Deduction: (%d%%) $ %.2f\n", (int)(deductionPercent * 100), deductionTotal);

		System.out.println("* 	------------|PAYMENT|-----------");
		System.out.printf("*	Net Pay: $ %.2f\n", netPay);

	}
}
