package UI;



import java.util.Scanner;



public class MainMenu {
	


	
	public void getAccountTypeMenu(){
		
	
	
	 System.out.println("                                                                         ");
     System.out.println("                                                                         ");
     System.out.println("                                                                         ");
     System.out.println("       +================================================================+");
     System.out.println("       |                                                                |");
     System.out.println("       |                Welcome to this Mobile Banking App              |");
     System.out.println("       |                                                                |");
     System.out.println("       +================================================================+");
     System.out.println("       +----------------------------------------------------------------+");
     System.out.println("       |                    [1] Checkings Account                       |");
     System.out.println("       +----------------------------------------------------------------+");
     System.out.println("       +----------------------------------------------------------------+");
     System.out.println("       |                    [2] Savings Account                         |");
     System.out.println("       +----------------------------------------------------------------+");
     System.out.println(" ");
     System.out.println(" ");
     System.out.println("       +----------------------------------------------------------------+");
     System.out.println("       |                    [5] EXIT                                    |");
     System.out.println("       +----------------------------------------------------------------+");
	
 	Scanner scanner = new Scanner(System.in);
 	int option = scanner.nextInt();
	
	
	switch(option) {
	
	case 1:
		//get Checking Menu
		CheckingsMenu ckmenu = new CheckingsMenu();
		ckmenu.getCheckingMenu();
		break;
		
	case 2:
		//get Savings Menu
		System.out.flush();
		SavingsMenu svmenu = new SavingsMenu();
	
		svmenu.getSavingsMenu();
		System.out.flush();
		break;
		
	case 3:
		//exit
		break;
	
				}
		
	scanner.close();
	
	}
	
}
