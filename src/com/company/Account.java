package com.company;

public abstract class Account implements IRate {
    //list common properties for savings and checking accounts.
    public String name;
    public String sSN;
    public int balance;

    public String accountNumber;
    public double rate;

    //constructor: setbase properties and initialize the account
    public Account (String name, String sSN, int initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        System.out.println("NEW ACCOUNT " +
                "\n*NAME: "+ this.name +
                "\n*SSN: " + this.sSN +
                "\n*BAL: " + this.balance);

    }

    //TODO: List common methods
}
