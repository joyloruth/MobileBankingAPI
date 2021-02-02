package models;


public class Accounts {

    private static double balance;
    
    public int accountId;
    public static int accountNumber = 0;
    
    public double amount;
    public double interest;



    public int getAccountNumber() {
        accountId = accountNumber++;
        return accountId;
    }
    

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {

        this.interest = interest;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        Accounts.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public static void makeDeposit(double amount) {
        if (amount < 0) {
            System.out.println("Invalid Entry. Please enter an amount greater than $0.");
        } else {
            balance += amount;
            System.out.println("You have successfully deposited $" + balance + ".");
        }
            }

    public static void makeWithdrawal(double amount){
        if (amount > balance) {
                System.out.println("Insufficient Funds.");
                System.out.println("The amount requesting to be withdrawn cannot be greater than balance available.");
        } else {
                balance += amount;
                System.out.println("You have successfully withdrawn $" + balance + ".");
            }
        }
    }

