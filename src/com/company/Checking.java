package com.company;

public class Checking extends Account{

    //list properties specific to cheking accounts
    public int debitCardNumber;
    public int debitCardPIN;

    //constructor: initialize checking account properties
    public Checking(String name, String sSN, int initDeposit){
        super(name, sSN, initDeposit);

        accountNumber = "2" + accountNumber;

        setDebitCard();
    }

    @Override
    public void setRate(){
        rate = getBaseRate() * .15;

    }

    //list any methods specifiic to the checking account

    public void showInfo(){
        super.showInfo();
        System.out.println("**ACCOUNT TYPE: Checking"+
                "\nYour Checking Account features..." +
                "\n***Debit Card Number: " + debitCardNumber +
                "\n***Debit Card PIN: " + debitCardNumber
                );

    }

    private void setDebitCard(){
        debitCardNumber = (int)(Math.random() * Math.pow(10,12));
        debitCardPIN = (int) (Math.random() * Math.pow(10,4));

    }
}
