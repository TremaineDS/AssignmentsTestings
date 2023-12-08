package workassignment;

import java.util.*;


//Assignment 15: Design an application called ATM pin validator , and will not validate PIN when wrong.


public class ATMEx {

		class accountholderException extends RuntimeException {
		public accountholderException() {
			System.out.println("This is the customer account holder..");
			
		}
		}
		class pinnumException extends RuntimeException {
			public pinnumException() {
				System.out.println("This is your pin number");
				
			}
		}	
	
	public static void main(String[] args) {
		System.out.println("Enter your pin number");
		Scanner scanner = new Scanner(System.in);
		checkPin(scanner.nextInt());
		scanner.close();
		System.out.println("If PIN incorrect, you will be locked out of the account for security purposes.");
		
	}
	
	private static void checkPin(int nextInt) {
		//
	}
	
	int number = 3; {
		
		if (number>5) {
		System.out.println("Enter your pin number in machine");
		throw new accountholderException();
		
	} else if (number<3) {
		System.out.println("You have two attempts left, or you will be locked out of account!");
		throw new pinnumException();
	}
	else {
		System.out.println("Your account has been LOCKED. Please contact representative.");
		
		
		
		
		
	}

}
}

