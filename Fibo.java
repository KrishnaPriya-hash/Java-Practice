import java.util.Scanner;
public class Fibo {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int a = 0;
	int b = 1;
	System.out.print(a + " " + b + " ");
	int count =2;    //finding nth fiboncci number
	while(count<=n) {
		int temp = a+b;
		a=b;
		b = temp;
		count++;		
		
	}
	System.out.printf(b + " ");
	
	for(int i =3;i<=n;i++) {    //printing fibinocci series upto n th term
		int next = a+b;
		a = b;
		b = next;
		System.out.print(b + " ");
	while(a<=100) {
		System.out.print(a + " "); //printing fibinocci series up to limit
	int next = a+b;
		a = b;
		b = next;
		Finding nth fibinocci term
	if(n==1) {
		System.out.print(a);
	} else if(n==2) {
		System.out.print(b);
	} else {
	int count = 3 ;
	while(count<=n) {
		int next = a+b;
		a = b;
		b = next;
		count++;
		
		
	}
	System.out.println(b);
	}
	Finding whether a number is fibonacci number or not
	while(a<n) {
		int next = a+b;
		a = b;
		b = next;
	}
	if(a==n) {
		System.out.println("Fibonacci number");
	} else {
		System.out.println("Not a Fibonacci number");
	}
	}	

}