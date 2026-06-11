/Implement a program that displays a message for a given number based on the below conditions.
//
//If the number is a multiple of 3, display "Zip".
//
//If the number is a multiple of 5, display "Zap".
//
//If the number is a multiple of both 3 and 5, display "Zoom",
//
//For all other cases, display "Invalid".
 
package programs;
import java.util.Scanner;
public class Multiple {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n%3 == 0 && n%5 == 0) {
			System.out.println("Zoom");
		} else if(n%3 == 0) {
			System.out.println("Zip");
		} else if(n%5 == 0) {
			System.out.println("Zap");
		} else {
			System.out.println("Invalid");
		}
			
	}

}
