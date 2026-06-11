Implement a program to find out whether a number is divisible by the sum of its digits. 

Display appropriate messages.

 package programs;
import java.util.Scanner;
public class SumOfDigits {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int original =n;
		int sum = 0;
		while(n>0) {
			int digit = n%10;
			sum = sum + digit;
			n= n/10;
		}
		if(original % sum == 0) {
			System.out.println(original + " is divisible by sum of its digits");
		} else {
			System.out.println(original + " not divisible by sum of its digits");
		}
	}

}
