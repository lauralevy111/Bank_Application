package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
        Checking checkingAccount1 = new Checking("Celine Dion","1234567890",1550);
        Savings savingsAccount1 = new Savings("Gloria Steinem","2341233567",34000);

        savingsAccount1.showInfo();
        checkingAccount1.showInfo();

         */

        // Read a csv file then create new accounts based on that data
        String filePath ="/Users/lauralevy/IdeaProjects/Bank_Application/data/NewBankAccounts_202003020954";
        List<String[]> newAccountHolders = CSV.read(filePath);

        for(String[] accountHolder: newAccountHolders){
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            int initDeposit = Integer.parseInt(accountHolder[3]);

            System.out.println("-" + name + " " + sSN + " " + accountType + " $"+ initDeposit);

            if(accountType.equals("Savings")) {
                System.out.println("OPEN A SAVINGS ACCOUNT");
            }
            else if(accountType.equals("Checking")){
                System.out.println("OPEN A SAVINGS ACCOUNT");
            }
            else{
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }
    }
}
