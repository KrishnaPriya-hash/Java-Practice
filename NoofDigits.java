import java.util.Scanner;
public class NoofDigits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = in.nextInt();
		System.out.print("Enter a digit: ");
		int digit = in.nextInt();
		int count =0;
		while(n>0) {
			int rem = n%10;
			if(rem == digit) {
				count++;
			}
			n=n/10;
		}
		System.out.print(count);
	}

}
