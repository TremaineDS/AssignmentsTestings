package workassignment;
import java.util.Scanner;


public class BankEx {


		
		int amount = 0;
		int getBalance;
		String name;
		public static void main(String[] args) {
			Scanner scanner = new Scanner (System.in);

			  BankEx b = new BankEx();
			  	System.out.println("Beginning amount");
		        System.out.println("amount = " +b.getBalance());

		        BankA ba = new BankA();

		        System.out.println("amount = " +ba.getBalance());	        

		        BankB bb = new BankB();

		        System.out.println("amount = " +bb.getBalance());  

		        BankC bc = new BankC();

		        System.out.println("amount = " +bc.getBalance());
		        System.out.println("This is your total amount");
		    }

		    int getBalance(){

		    return 0;

		    }

		}



		class BankA extends BankEx{

		    int getBalance(){

		    int deposit = 1000;

		    amount = amount + deposit; 

		    return amount;

		    }

		}



		class BankB extends BankEx{

		    int getBalance(){

		    int deposit = 1500;

		    amount = amount + deposit; 

		    return amount;

		    }

		}



		class BankC extends BankEx{    

		    int getBalance(){

		    int deposit = 1600;

		    amount = amount + deposit; 

		    return amount;

	}

		
		
		
		
	}


