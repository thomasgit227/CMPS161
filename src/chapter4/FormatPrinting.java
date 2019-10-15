package chapter4;

public class FormatPrinting {
	public static void main(String[] args) {
		
		double num = 145.902343;
		
		System.out.printf("This %-2c , is a formatted char \n", 'z');
		System.out.printf("This is %b , and this is %6B \n", 45 > 52, true);
		System.out.printf("This is %d decimal format \n", (int)num);
		System.out.printf("This is %f floating point format \n", num);
		System.out.printf("This is %e scientific format \n", num);

	}
}
