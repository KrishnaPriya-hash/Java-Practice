import java.util.Scanner;
public class Calender {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int day = in.nextInt();
		int Month = in.nextInt();
		int Year = in.nextInt();
		int maxdays;
		if(Month == 1 || Month==3 || Month==5 || Month==7 || Month==8 || Month==10 || Month == 12 ) {
			maxdays = 31;
		} else if (Month == 4 || Month==6 || Month==9 || Month==11) {
			maxdays = 30;
		} else {
			maxdays = 28;
		}
		if(day<maxdays) {
			day++;
			} else {
				day=1;
				Month++;
		}
		if(Month>12) {
			day =1;
			Month = 1;
			Year++;
			
		}
		System.out.println(day +"-"+ Month + "-"+ Year);
	}
	

}
