package chapter6;

/*
 * Thomas Floyd (W#0699719)
 * CMPS 161_05
 * Dr. Bonnie Achee
 * October 30, 2019
 * 
 * Summary: 
 * Returns how many days in the year based off leap year calculations
 */

public class NumDays {
	public static void main(String[] args) {
		int year = 2019;
		System.out.printf("The year %d has %d days", year, daysInYear(year));
	}
	
	public static int daysInYear(int year) {
		if(isLeapYear(year)) {
			return 366;
		}
		return 365;
	}
	
	public static boolean isLeapYear(int year) {
		if( (year % 40 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ) {
			return true;
		}
		return false;
	}
}
