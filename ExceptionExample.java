package workassignment;

import java.util.Scanner;

//Assignment 14: Create and Raise the exception CreditsNotSuffiecientException if  credits are less than 50 with different caller methods. and handle them..

class CreditsException extends RuntimeException {
public CreditsException() {
System.out.println("You have enough credit to register");
}
}
class NotSuffiecientException extends RuntimeException {
public NotSuffiecientException() {
	System.out.println("You don't have enough credit to register");
}
}

public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println("Enter your Credits :");
		Scanner scanner=new Scanner(System.in);
		checkCredit(scanner.nextInt());
		scanner.close();
		System.out.println("Thank You");
	}

	private static void checkCredit(int i) {
		// TODO Auto-generated method stub


	int number = 50;
	if(number>40) {
	System.out.println("hey you can apply for credit");
	throw new CreditsException();
	}else if (number<60) {
	System.out.println("hey you do not have enough credit to apply");
	throw new NotSuffiecientException();
	}else {
		System.out.println("Congraduation you can apply for credit");
	}

	}

}