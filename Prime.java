import java.util.Scanner;
public class prime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int num = 2; num<=n;num++) {
			int count = 0;
			for(int i =1;i*i <= num;i++) {
				if(num %i ==0) {
					count+=1;
				}
			}
			if(count == 1) {
				System.out.print(num + " ");
		}
		}
	}

}
