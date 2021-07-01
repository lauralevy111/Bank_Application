package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<Account>();

        // Read a csv file then create new accounts based on that data
        String filePath ="/Users/lauralevy/IdeaProjects/Bank_Application/data/NewBankAccounts_202107011022";
        List<String[]> newAccountHolders = CSV.read(filePath);

        for(String[] accountHolder: newAccountHolders){
            String name = accountHolder[1];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            int initDeposit = Integer.parseInt(accountHolder[0]);

            if(accountType.equals("Savings")) {
                accounts.add(new Savings(name, sSN, initDeposit));
            }
            else if(accountType.equals("Checking")){
                accounts.add(new Checking(name, sSN, initDeposit));

            }
            else{
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

        for(Account acc: accounts){
            System.out.println("*****************");
            acc.showInfo();
        }

    }
}
