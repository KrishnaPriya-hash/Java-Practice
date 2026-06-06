import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int original =n;
		int temp,rem,count = 0,res =0;
		temp =n;
		while(temp>0) {
			temp = temp/10;
			count++;
			}
		temp =n;
		while(temp>0) {
			rem = temp%10;
			res = res+(int)Math.pow(rem, count);
			temp = temp / 10;
		}
		if(res == original) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}
		}
}