package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<Account>();

        // Read a csv file then create new accounts based on that data
        String filePath ="/Users/lauralevy/IdeaProjects/Bank_Application/data/NewBankAccounts_202109270645";
        String filePath2 ="/Users/lauralevy/IdeaProjects/Bank_Application/data/NewBankAccounts_202107071022";
        List<String[]> newAccountHolders = CSV.read(filePath);
        for(Account account:accounts){
            //todo: modify
            account.showInfo();
        }

        //List<String[]> newAccountHolders2 = CSV.read(filePath2);
        /*
        for(String[] accountHolder2: newAccountHolders2){

            
        }
        */

        for(String[] accountHolder: newAccountHolders){
            String name = accountHolder[1];
            String sSN = accountHolder[1];
            String accountType = accountHolder[1];

            int initDeposit = Integer.parseInt(accountHolder[0]);
            int depositN = Integer.parseInt(accountHolder[1]);


            if(accountType.equals("Savings")) {
                accounts.add(new Savings(name, sSN, initDeposit));
            }
            else if(accountType.equals("Checking")){
                accounts.add(new Checking(name, sSN, initDeposit));

            }
            else{
                //error case
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

        for(Account acc: accounts){
            System.out.println("***************");
            acc.showInfo();
        }

    }
}
