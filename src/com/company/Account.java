package com.company;

public abstract class Account implements IBaseRate {
    //list common properties for savings and checking accounts.
    protected  String name;
    public String sSN;
    public int balance;

    private static int index = 10000;
    protected String accountNumber;
    protected double rate;

    //constructor: setbase properties and initialize the account
    public Account (String name, String sSN, int initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        //SET ACCOUNT NUMBER
        index++;
        this.accountNumber = setAccountNumber();

        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber(){
        int start = sSN.length()-2;
        int end = sSN.length();
        String lastTwoOfSSN = sSN.substring(start,end);

        int uniqueID = index;

        int randomNumber =(int) ( Math.random() * Math.pow(10,3));

        return lastTwoOfSSN+uniqueID+randomNumber;

    }

    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance = balance + (int)accruedInterest;
        System.out.println("Accrued Interest: $"+accruedInterest);
        printBalance();
    }

    //list common methods: transactions
    public void deposit(int amount){
        balance = balance + amount;
        System.out.println("Depositing: $" + amount+".");
        printBalance();
    }
    public void withdraw(int amount){
        balance = balance - amount;
        System.out.println("Withdrawing: $" + amount+".");
        printBalance();
    }
    public void transfer(String toWhere, int amount){
        balance = balance - amount;
        System.out.println("Transfering: $" + amount + " to " + toWhere);
        printBalance();
    }

    public void printBalance(){
        System.out.println("Your Balance is now $" + balance);
    }

    public void showInfo(){
        System.out.println("NEW ACCOUNT " +
                "\n*NAME: "+ name +
                "\n*ACCOUNT NUMBER: " + accountNumber +
                "\n*BALANCE: " + balance +
                "\n*RATE: " + rate + "%");
    }
}
