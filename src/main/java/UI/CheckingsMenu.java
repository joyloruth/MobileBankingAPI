package UI;

import java.util.Scanner;

//import models.Accounts;
import models.Checkings;

public class CheckingsMenu {

	public double amount = 0;

	public void getCheckingMenu(){
		
	        
	        System.out.println("       +================================================================+");
	        System.out.println("       |                                                                |");
	        System.out.println("       |                      CHECKINGS ACCOUNT                         |");
	        System.out.println("       |                                                                |");
	        System.out.println("       |     Please select one of the options below to get started.     |");
	        System.out.println("       +================================================================+");
	        System.out.println("       +----------------------------------------------------------------+");
	        System.out.println("       |                    [1] Create an account                       |");
	        System.out.println("       +----------------------------------------------------------------+");
	        System.out.println("       +----------------------------------------------------------------+");
	        System.out.println("       |                    [2] Check your balance                      |");
	        System.out.println("       +----------------------------------------------------------------+");
	        System.out.println("       +----------------------------------------------------------------+");
	        System.out.println("       |                    [3] Make a deposit                          |");
	        System.out.println("       +----------------------------------------------------------------+");
	        System.out.println("       +----------------------------------------------------------------+");
	        System.out.println("       |                    [4] Make a withdrawal                       |");
	        System.out.println("       +----------------------------------------------------------------+");
	        System.out.println("       +----------------------------------------------------------------+");
	        System.out.println("       |                    [5] View Last Transaction                   |");
	        System.out.println("       +----------------------------------------------------------------+");
	        System.out.println("       +----------------------------------------------------------------+");
	        System.out.println("       |                    [6] Calculate Interest                      |");
	        System.out.println("       +----------------------------------------------------------------+");
	        System.out.println(" ");
	        System.out.println(" ");
	        System.out.println("       +----------------------------------------------------------------+");
	        System.out.println("       |                    [0] EXIT                                    |");
	        System.out.println("       +----------------------------------------------------------------+");
	
	Scanner scanner = new Scanner(System.in);
	int option = scanner.nextInt();
	
	switch (option) {
  case 1:
      //create account
      //createAccount();

      break;
  case 2:
      //view balance
	  	
		double intialDeposit = scanner.nextDouble();
		//Checkings checking = new Checkings(intialDeposit);
		
		System.out.println(intialDeposit);

      break;
      
  case 3:
      //make a deposit
      System.out.println("Enter Deposit Amount: ");
      amount = scanner.nextDouble();
      Checkings.makeDeposit(amount);

      break;
      
  case 4:
      //make a withdrawal
      System.out.println("Enter Withdrawal Amount");
      amount = scanner.nextDouble();
      Checkings.makeWithdrawal(amount);
      break;

  case 5:
      //view last Transaction
      System.out.println("View LastTransaction");
      amount = scanner.nextDouble();
      System.out.println(amount);
      break;

  case 6:
      //calculate interest
      System.out.println("CalculateInterests");
      amount = scanner.nextDouble();
      System.out.println(amount);
      break;

  case 0:
      System.out.println("Thank you for banking with the Loft Mobile Banking app, where your money is at your fingertips.");
      System.exit(0);
      break;
      
  default:
      //throw new IllegalStateException("Unexpected value: " + option);
     
		}
	
	scanner.close();
	}
	
}
