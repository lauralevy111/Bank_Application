package com.company;

public class Savings extends Account{

    //List properties specific to the Savings account
    public int safetyDepositBoxID;
    public int safetyDepositBoxKey;

    //constructor : initialize settings for the savings properties
    public Savings(String name, String sSN, int initDeposit){
        super(name, sSN, initDeposit);

        accountNumber = "1" + accountNumber;
        //System.out.println("*ACCOUNT NUMBER: " + this.accountNumber);

        //System.out.println("**NEW SAVINGS ACCOUNT");
    }

    // list any methods specific to savings accounts

    public void showInfo(){
        super.showInfo();
        System.out.println("**ACCOUNT TYPE: Savings");

    }
}
