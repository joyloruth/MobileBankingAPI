package models;

public class Savings extends Accounts{


    //private static String accountType =  "Savings";

    public Savings(double initialDeposit) {
        super();
        this.setBalance(initialDeposit);

        if(initialDeposit > 10000)
        {this.setInterest(0.045);}
        else
            {this.setInterest(0.02);}


        }

    }

