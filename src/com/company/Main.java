package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("**************************");

        Checking checkingAccount1 = new Checking("Celine Dion","1234567890",1550);
        Savings savingsAccount1 = new Savings("Gloria Steinem","2341233567",34000);

        checkingAccount1.showInfo();
        System.out.println("**************************");
        savingsAccount1.showInfo();

        //TODO: Read a csv file then create new accounts based on that data
    }
}
