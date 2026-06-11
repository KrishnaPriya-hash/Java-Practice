// Assignment 5

package programs;
import java.util.Scanner;
public class Tester {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int accountNumber = in.nextInt();
		int accountBalance =in.nextInt();
		int Sal = in.nextInt();
		String LoanType = in.next();
		int exploan = in.nextInt();
		int expEMIs= in.nextInt();
		if(accountNumber <1000 || accountNumber>=9999 || accountNumber/1000!=1 ||  accountBalance <1000) {
			System.out.println(-1);
			return;
		}
		if(Sal >25000 && LoanType.equals("car") && exploan <=500000 && expEMIs <= 36) {
			System.out.println("elibileLoanAmount = 500000");
			System.out.println("elibile Emis = 36");
		} else if(Sal>50000 && LoanType.equals("House") && exploan <=600000 && expEMIs <= 60) {
			System.out.println("elibileLoanAmount = 600000");
			System.out.println("elibile Emis = 60");
		}else if(Sal > 75000 && LoanType.equals("Business") && exploan <=7500000 && expEMIs <= 84) {
			System.out.println("elibileLoanAmount = 7500000");
			System.out.println("elibile Emis = 84");
		} else
			System.out.println(-1);
	}

}
