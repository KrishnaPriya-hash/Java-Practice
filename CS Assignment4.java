/Food Corner home delivers vegetarian and non-vegetarian meals to its customers based on the order.
//A vegetarian combo costs $12 per plate and a non-vegetarian combo costs $15 per plate. Apart from the cost per plate of food, customers are also charged for home delivery based on the distance in kms from the restaurant to the delivery point. The delivery charges are as mentioned below:
//First 3Km $0
//next 3km $1
//Remaining kms $2
//Given the type of food, quantity (no. of plates) and the distance in kms from the restaurant to the delivery point, implement a program to calculate the final bill amount to be paid by a customer.

//The below information must be used to check the validity of the data provided by the customer: 
//
//Type of food must be 'V' for vegetarian and 'N' for non-vegetarian.
//
//Distance in kms must be greater than 0.
//
//Quantity ordered should be minimum 1.
//
//If any of the input is invalid, the bill amount should be displayed as -1.
package programs;
import java.util.Scanner;
public class FoodCorner {
	public static void main(String [] args) {
	Scanner in = new Scanner(System.in);
	String Foodtype = in.next();
	int distance = in.nextInt();
	int quantity = in.nextInt();
	int BillAmount;
	if(distance <= 0 || quantity < 1) {
		System.out.println(-1);
		return;
	}
	if(Foodtype.equals("V")) {
		if(distance <= 3) {
			BillAmount = 12 * quantity;  
		} else if(distance<=6) {
			BillAmount = (12 * quantity) + ((distance - 3)*1);
		} else {
			BillAmount = (12 * quantity) + (3*1) + (distance - 6)*2 ;
		}
	}else if(Foodtype.equals("N")) {
		if(distance <= 3) {
			BillAmount = 15 * quantity;  
		} else if(distance<=6) { 
			BillAmount = (15 * quantity) + ((distance - 3)*1);
		} else {
			BillAmount = (15 * quantity) + (3*1) + (distance - 6)*2 ;
		}
	System.out.println(BillAmount);
	}else {
		System.out.println(-1);
	}
	}

}
