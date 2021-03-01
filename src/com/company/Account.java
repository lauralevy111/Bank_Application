package com.company;

public abstract class Account implements IBaseRate {
    //list common properties for savings and checking accounts.
    public String name;
    public String sSN;
    public int balance;

    static int index = 10000;
    public String accountNumber;
    public double rate;

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

    //list common methods

    public void deposit(){
        
    }

    public void showInfo(){
        System.out.println("NEW ACCOUNT " +
                "\n*NAME: "+ name +
                "\n*ACCOUNT NUMBER: " + accountNumber +
                "\n*BALANCE: " + balance +
                "\n*RATE: " + rate + "%");
    }
}
