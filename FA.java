package dA;

import java.util.Scanner;

public class FA {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		int Thirsty;
		
		
		System.out.print(" Hungry,");
		System.out.println(" Get in Line, ");
		System.out.print(" Are you thirsty? 1=yes, 2=no, ");
		Thirsty = input.nextInt();
		
		if(Thirsty == 1) 
		{
			System.out.print(" Buy coke, ");
			System.out.print(" Buy Lunch, ");
			System.out.print(" Eat Lunch, ");

		
		}
		else if (Thirsty == 2)
		{
		
			System.out.print(" Buy Lunch, ");
			System.out.print(" Eat Lunch, ");

			
		}
		else 
	
	System.out.print(" Eat Lunch, ");
		System.out.print("");
	System.out.print(" Return Tray, ");
	System.out.print(" Leave. ");
	

	}
		
 }
