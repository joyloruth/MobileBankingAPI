package UI;
import java.util.Scanner;

import models.Accounts;

public class Start {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Mobile Bank");
		System.out.println("Please choose an option.");
		System.out.println("1. Get account number.");
		System.out.println("2. Make a Deposit.");
		System.out.println("3. Make a Withdrawal.");
		
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		
		
		
		
		switch(option) {
		
		case 1:
			
			Accounts acct = new Accounts();
			acct.getAccountId();
			
			break;
			
		case 2:
			
			 System.out.println("Enter Deposit Amount: ");
			 int amount = scanner.nextInt();
			 Accounts.makeDeposit(amount);
			
			break;
			
		case 3:
			
			System.out.println("Enter Withdrawal Amount: ");
			amount = scanner.nextInt();
			Accounts.makeWithdrawal(amount);
			
			break;
		}
		
		scanner.close();

	}
	
	

}
