package chapter7;

/*
 * Thomas Floyd (W#0699719)
 * CMPS 161_05
 * Dr. Bonnie Achee
 * November 13, 2019
 * 
 * Summary: 
 * Array copying served two ways
 */

public class ArrayCopier {
	
	public static void main(String[] args) {
		//Array Deceleration
		int[] a = {5, 67, 128, 892, 1203, 3255}; //Put your OG data in here
		int[] b = new int[a.length];
		
		//Print Before
		System.out.printf("Array A: %s \n", printArrayItems(a));
		System.out.printf("Array B: %s \n", printArrayItems(b));

		//Use Preferred Method
		copyArrayInLoop(a, b);
		//copyArrayInSystem(a, b);
		
		//Print After
		System.out.printf("Array A: %s \n", printArrayItems(a));
		System.out.printf("Array B: %s \n", printArrayItems(b));
	}
	
	static void copyArrayInLoop(int[] template, int[] form) {
		for(int i = 0; i < template.length; i++) {
			form[i] = template[i];
		}
	}
	
	static void copyArrayInSystem(int[] template, int[] form) {
		System.arraycopy(template, 0, form, 0, template.length);
	}
	
	static String printArrayItems(int[] array) {
		String output = "";
		for(int i = 0; i < array.length; i++) {
			if(i == 0) {
				output += array[i];
			}
			else {
			output += (", " + array[i]);
			}
		} 
		return output;
	}
}
