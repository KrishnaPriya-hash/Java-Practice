//Implement a program to display the sum of two given numbers if the numbers are same. If the numbers are not same, display the double of the sum.
import java.util.Scanner;
class SumOfNums {
	public static void main(String[] args) {
		// Implement your code here 
		Scanner in = new Scanner(System.in);
		    int num1 = in.nextInt();
		    int num2 = in.nextInt();
		    if(num1 == num2){
		        System.out.println(num1 + num2);
		    } else{
		        System.out.println(2*(num1+num2));
		    }
	}
}