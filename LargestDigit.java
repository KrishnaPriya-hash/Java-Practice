import java.util.Scanner;
public class LargestDigit {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int max =0;
		while(n>0) {
			int digit =n%10;
			if(digit>max) {
				max =digit;
			}
			n = n/10;
		}
		System.out.println(max);
	}

}