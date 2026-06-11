package programs;
import java.util.Scanner;
public class palindrome {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		palindromeNumber(n);
	}
	static void palindromeNumber(int n) {
		int original = n;
		int rev =  0;
		while(n>0) {
			int rem =n%10;
			rev = rev *10 + rem;
			n= n/10;
		}
		if(original == rev) {
			System.out.println(original + " is a palindrome");
		} else {
			System.out.println(original + " is not a palindrome");
		}
		
	}

}
