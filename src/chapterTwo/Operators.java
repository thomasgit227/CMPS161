package chapterTwo;

/*
 * Thomas Floyd (W#0699719)
 * CMPS 161_05
 * Dr. Bonnie Achee
 * September 9, 2019
 * 
 * Summary: 
 * This stores some various examples of operators to use as reference, also I'm bored and feel like being extra
 */

public class Operators {

	public static void main(String[] args) {
		
		double a = 5.7;
		double b = 16.2;
	
	//Standard Operations
		double added = a + b;
		double subtracted = a - b;
		double multiplied = a * b;
		double divided = a / b;
		double modulated = a % b;
		
	//Assignment Operations, can be used without declaring a new variable
		double assignAdd = a += 2;
		double assignSub = a -= 2;
		double assignMul = a *= 2;
		double assignDiv = a /= 2;
		double assignMod = a %= 2;
		
	//Incremental Operations, can be used without declaring a new variable
		//These will operate on a, and then set the variable equal to the changed "a"
		double preIncrement = ++a;
		double preDecrement = --a;
		//These will set the variable equal to "a", and then operate on "a"
		double postIncrement = a++;		
		double postDecrement = a--;
		
		System.out.println("This is Concatenation " + "I added this part to the end");
	}
}
