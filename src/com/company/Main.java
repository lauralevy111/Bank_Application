package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<Account>();



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

                accounts.add(new Savings(name, sSN, initDeposit));
            }
            else if(accountType.equals("Checking")){
                System.out.println("OPEN A CHECKING ACCOUNT");
                accounts.add(new Checking(name, sSN, initDeposit));

            }
            else{
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }
    }
}
