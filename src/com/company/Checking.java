package com.company;

public class Checking extends Account{

    //list properties specific to cheking accounts
    public int debitCardNumber;
    public int debitCardPIN;

    //constructor: initialize checking account properties
    public Checking(String name, String sSN, int initDeposit){
        super(name, sSN, initDeposit);

        accountNumber = "2" + accountNumber;
        System.out.println("*ACCOUNT NUMBER: " + this.accountNumber);

        System.out.println("**NEW CHECKING ACCOUNT");
    }

    //TODO:list any methods specifiic to the checking account
}
