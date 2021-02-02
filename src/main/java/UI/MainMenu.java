package UI;
//import java.util.Scanner;
//
//public class MainMenu {
//
//    //create variables//
//    Scanner scanner = new Scanner(System.in);
//
//    Bank bank = new Bank();
//
//    boolean exit;
//    private int option;
//    private double balance = 0;
//    private int amount;
//
//
//    public static void main(String[] args) {
//        MainMenu menu = new MainMenu();
//        menu.driveMenu();
//
//
//    }
//
//    public void driveMenu() {
//        viewHeader();
//
//        while (!exit) {
//            ViewMenu();
//            option = getInput(option);
//            execute(option);
//        }
//
//    }
//
//
//    private void viewHeader() {
//        System.out.println("--------------------------------------------------");
//        System.out.println("   Welcome, Thank you for choosing Lofts Banking  ");
//        System.out.println("--------------------------------------------------");
//    }
//
//    private void ViewMenu() {
//        System.out.println("What would you like to do?");
//        System.out.println("Please select one of the options below to get started");
//        System.out.println("[1] Create an account.");
//        System.out.println("[2] Check your balance.");
//        System.out.println("[3] Make a deposit");
//        System.out.println("[4] Make a withdrawal.");
//        System.out.println("[5] View Last Transaction");
//        System.out.println("[6] Calculate Interest");
//        System.out.println("[0] Exit.");
//
//    }
//
//    private int execute(int option) {
//        do {
//            System.out.println("Enter an option,please: ");
//            option = -1;
//            try {
//                option = Integer.parseInt(scanner.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid Entry. Numeric values only");
//            }
//
//            if (option < 0 || option > 6) {
//                System.out.println("Please select a option between 1-");
//            }
//        }
//        while (option < 0 || option > 6);
//        return option;
//
//
//    }
//
//
//    private int getInput(int option) {
//        switch (option) {
//            case 1:
//                //create account
//                createAccount();
//
//                break;
//            case 2:
//                //view balance
//                System.out.println(balance);
//
//                break;
//            case 3:
//                //make deposit
//                System.out.println("Enter Deposit Amount: ");
//                amount = scanner.nextInt();
//                Account.makeDeposit(amount);
//
//                break;
//            case 4:
//                //make a deposit
//                System.out.println("");
//                int amount = scanner.nextInt();
//                Account.makeWithdrawal(amount);
//                break;
//
//            case 5:
//                //view last Transaction
//                System.out.println("View LastTransaction");
//                amount = scanner.nextInt();
//                System.out.println(amount);
//                break;
//
//            case 6:
//                //calculate interest
//                System.out.println("CalculateInterests");
//                amount = scanner.nextInt();
//                System.out.println(amount);
//                break;
//
//            case 0:
//                System.out.println("Thank you for banking with the Loft Mobile Banking app, where your money is at your fingertips.");
//                System.exit(0);
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + option);
//
//
//        }
//
//
//        return option;
//    }
//
//    private void createAccount() {
//        String firstname, lastname, ssn, accountType, phoneNumber;
//        double initialDeposit;
//        boolean valid = false;
//
//        while (!valid) {
//            System.out.println("Pick an Account Type: Checking or Savings");
//            accountType = scanner.nextLine();
//            if (accountType.equalsIgnoreCase("Checking") || accountType.equalsIgnoreCase("Savings"))
//                valid = true;
//            else {
//                System.out.print("Invalid entry.Please select either a Checking or Savings account");
//            }
//
//            System.out.println("Please enter the following: ");
//            System.out.println("First name: ");
//            firstname = scanner.nextLine();
//
//            System.out.println("Last name: ");
//            lastname = scanner.nextLine();
//
//            System.out.println("Social Security number: ");
//            ssn = scanner.nextLine();
//
//            System.out.println("Phone number: ");
//            phoneNumber = scanner.nextLine();
//
//            System.out.println("Initial Deposit: ");
//            initialDeposit = scanner.nextDouble();
//
//            Account account = new Account();
//
//            if (accountType.equalsIgnoreCase("checking")) {
//                account = new CheckingAccount(initialDeposit);
//            } else {
//                account = new SavingsAccount(initialDeposit);
//            }
//            User user = new User(firstname,lastname,ssn,account);
//            bank.adduser(user);
//
//        }
//
//        //private void checkBalance() {}
//
//       //private void makeDeposit(amount) {}
//        //Account.makeDeposit(amount);
//
//        //private void makeWithdrawal() {}
//
//        //private void viewLastTransaction() {}
//
//        //private void calculateInterest() {}
//
//
//    }
//}