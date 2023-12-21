package workassignment;

import java.util.Scanner;
public class ElectricityBill {

	public static void main(String[] args) {

		Scanner Scanner = new Scanner (System.in);
		System.out.println("Please enter the number of units");
		int units = Scanner.nextInt();
		System.out.println("The bill entered"+units);

		if(units<120) 
		{

		double bill = units*1.20;
		}
		else if(units<100);
		{
		double bill = 100*1.20+(units - 50)*2;
		}
		if(units>400);
		{
		double bill = 100*1.20+200*2+(units - 100)*3;
		}

		System.out.println("Bill to pay :" +units);
	} 
	}

