// Implement a program to calculate the product of three positive integer values. However, if one of the integers is 7, consider only the values to the right of 7 for calculation. If 7 is the last integer, then display -1.
package programs;
import java.util.Scanner;
public class ProductOfNums {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		if(num2 ==7) {
			System.out.println(num3);
		} else if(num1 == 7) {
			System.out.println(num2*num3);
		} else if(num3 == 7) {
			System.out.println(-1);
		} else {
			System.out.println(num1*num2*num3);
		}
		
	}

}