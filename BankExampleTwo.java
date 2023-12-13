package workassignment;

import java.util.Scanner;

public class BankExampleTwo {

		//ABC Banking
		//1. Create Account
		//2. Credit
		//3. Debit
		//4 Transfer Amount
		//5. Mini Statement
		//Enter the option : 1
		//Account is created and the account number is 545
		//Do you Want to Continue (Y/N): Y
			//ABC Banking
				//1. Create Account
				//2. Credit
				//3. Debit
				//4 Transfer Amount
				//5. Mini Statement
				//Enter the option : 2
		//Amount is created
		//Do you Want to Continue (Y/N):N
		//Thank you. Please visit again 

public static void main(String[] args) {

	char exitOption;
	Scanner scanner=new Scanner(System.in);
	do {
		System.out.println("ABC Banking");
		System.out.println("1.Create Account");
		System.out.println("2.Credit");
		System.out.println("3.Debit");
		System.out.println("4.Tranfer the Amount");
		System.out.println("5.Mini Statement");

		System.out.println("Enter option");
		int option=scanner.nextInt();

		switch (option) {
			case 1:
				System.out.println("Account is created");
				break;
			case 2:
				System.out.println("Amount is Credited");
				break;
			case 3:
				System.out.println("Amount is debited");
				break;
			case 4:
				System.out.println("Amount is transferred");
				break;
			case 5:
				System.out.println("Mini Statmeent");
				break;
			default:
				break;
		}
		System.out.println("Do You Want to Continue (Y/N)");
		exitOption=scanner.next().charAt(0);
	}while(exitOption=='Y');	
	scanner.close();
	System.out.println("Thank You.. Please visit again ");	
}


	}


