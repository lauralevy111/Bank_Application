package com.company;

public class Main {

    public static void main(String[] args) {

        Checking checkingAccount1 = new Checking("Celine Dion","1234567890",1550);
        Savings savingsAccount1 = new Savings("Gloria Steinem","2341233567",34000);

        savingsAccount1.showInfo();
        checkingAccount1.showInfo();

        savingsAccount1.deposit(5000);
        savingsAccount1.withdraw(300);
        savingsAccount1.transfer("brokerage",3000);


        //TODO: Read a csv file then create new accounts based on that data
    }
}
