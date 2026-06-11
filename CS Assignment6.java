package programs;
import java.util.Scanner;
public class Notes {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int $1note = in.nextInt();
		int $5note =in.nextInt();
		int Amount = in.nextInt();
		int $1noteneeded = 0;
		int $5noteneeded = 0;
		if(Amount>0) {
				$5noteneeded = Amount/5;
				$1noteneeded = Amount%5;
			}
			
		if($1note>=$1noteneeded && $5note>=$5noteneeded) {
			System.out.println($5noteneeded);
			System.out.println($1noteneeded);
		}
		else {
			System.out.println(-1);
		}
	}

}
