package programs;
import java.util.Scanner;
public class QuadraticEquation {
	public static void main(String[] args) {
		// Implement your code here 
		Scanner in = new Scanner(System.in);
		System.out.print("a = " + " ");
		    int a = in.nextInt();
		    System.out.print("b = " + " ");
		    int b = in.nextInt();
		    System.out.print("c = ");
		    int c = in.nextInt();
		    double dis = Math.pow(b, 2)-(4*a*c);
		    if(dis == 0) {
		    	double x = (-b)/(2.0*a);
		    	System.out.println("The Roots is"+x);
		    } else if(dis>0) {
		    	double x1 = (-b+Math.sqrt(dis))/(2.0*a);
		    	double x2 = (-b-Math.sqrt(dis))/(2.0*a);
		    	System.out.println("The Roots are "+x1 +","+x2);
		    } else {
		    	System.out.println("The equation has no real root");
		    }
	}
}