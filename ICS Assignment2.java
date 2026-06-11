//Assignment 2 Iteration Control Structure
//Implement a program to find the number of rabbits and chickens in a farm. Given the number of heads and legs of the chickens and rabbits in a farm, identify and display the number of chickens and rabbits in the farm.
package programs;
import java.util.Scanner;
public class Test {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int heads = in.nextInt();
		int legs = in.nextInt();
		int rabbits = (legs -(2*heads))/2;
		int chickens = heads - rabbits;
		if(legs%2 !=0 || chickens+rabbits != heads || rabbits <0 || chickens<0 || 2*chickens +4*rabbits != legs) {
			System.out.println(" The  Number of Chickens and rabbits cannot be found");
		} else {
			System.out.println("Chickens = "+chickens);
			System.out.println("Rabbits = "+rabbits);
		}
	}

}
