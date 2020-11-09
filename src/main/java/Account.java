

public class Account {

    private static double balance;
    //public double balance;
    public double interest;

    private int accountId;
    private static int accountNumberBank = 370000370;
    private double amount;



    Account() {
        accountId = accountNumberBank++;


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
        this.balance = balance;
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
            System.out.println("You have successfully withdrawn $" + balance + ".");
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

