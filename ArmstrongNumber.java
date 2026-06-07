import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args) {
		for(int i =0;i<1000;i++) {
			if(isArmstrong(i)) {
				System.out.print(i+ " ");
			}
		}
	}
	static boolean isArmstrong(int n) {
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
			return true;
		}
		return false;
		}
	}