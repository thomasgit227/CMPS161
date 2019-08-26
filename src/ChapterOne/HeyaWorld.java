/*******************************************************************************
 * Thomas Floyd (W#0699719)
 * CMPS 161_05
 * Dr. Bonnie Achee
 * August 26, 2019
 * Simple println() Program to say "Heya" to the current System user.
 ******************************************************************************/
package ChapterOne;

public class HeyaWorld {
	public static void main(String[] args) {
		System.out.println("Heya " + System.getProperty("user.name"));
	}
}
