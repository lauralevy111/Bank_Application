package com.company;

public class Savings extends Account{

    //List properties specific to the Savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    //constructor : initialize settings for the savings properties
    public Savings(String name, String sSN, int initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        accountNumber = "2" + accountNumber;
        setSafetyDepositBox();

    }

    @Override
    public void setRate(){
        rate = getBaseRate() - .25;
    }

    // list any methods specific to savings accounts

    public void showInfo(){
        super.showInfo();
        System.out.println("**ACCOUNT TYPE: Savings");
        System.out.println("Your Savigns Account features..." +
                "\n***SafetyDepositBox ID: " + safetyDepositBoxID +
                "\n***SafetyDepositBox key: " + safetyDepositBoxKey);

    }

    public void setSafetyDepositBox(){
        safetyDepositBoxID =(int)( Math.random()*Math.pow(10,3));
        safetyDepositBoxKey = (int)(Math.random()*Math.pow(10,4));


    }

}
