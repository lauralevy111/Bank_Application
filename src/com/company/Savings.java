package com.company;

public class Savings extends Account{

    //List properties specific to the Savings account
    public int safetyDepositBoxID;
    public int safetyDepositBoxKey;

    //constructor : initialize settings for the savings properties
    public Savings(String name){
        super(name);
        System.out.println("**NEW SAVINGS ACCOUNT");
    }

    //TODO: list any methods specific to savings accounts
}
