import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter number1:");
		int num1 = input.nextInt();
		System.out.print("enter number2:");
		int num2 = input.nextInt();
		int sum =num1+num2;
		System.out.println("The sum of num1 and num2 is:" + sum);
	}

}