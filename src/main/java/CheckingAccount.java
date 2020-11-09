

public class CheckingAccount extends Account {
    private static String accountType =  "Checking";

    public CheckingAccount(double initialDeposit) {
        super();

        this.setBalance(initialDeposit);

    }
}
