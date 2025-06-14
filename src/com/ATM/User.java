package com.ATM;

import java.util.Scanner;

public class User extends Entity{
	public static void main(String[] args) {
		System.out.println("wellcome in ATM");
		
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Choose 1 for Check Balance");  
	        System.out.println("Choose 2 for Deposit");  
	        System.out.println("Choose 3 for Withdraw");  
	        System.out.println("Choose 4 for EXIT");  
	        System.out.print("Choose the operation you want to perform:");
	        
	        Entity e1 = new Entity();
	        
	        int choice= sc.nextInt();
	        switch(choice) {
	        case 1:
	        	System.out.println("checking user bank balance");
	        	e1.Cbalance();
	        	break;
	        case 2:
	        	System.out.println("Enter amount you want to deposite");
	        	int depo=sc.nextInt();
	        	e1.deposite(depo);
	        	break;
	        	
	        case 3: 
	        	System.out.println("Enter amount you want to withdraw");
	        	int withd=sc.nextInt();
	        	e1.withdraw(withd);
	        	break;
	        	
	        case 4: 
	        	System.out.println("Thank you for using the ATM. Goodbye!");
	        	sc.close();
	        	return;
	        }
	        
	        
		}
	}
}
