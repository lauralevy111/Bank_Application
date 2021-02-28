package com.company;

public class Checking extends Account{

    public String name;

    //TODO: list properties specific to cheking accounts

    //constructor: initialize checking account properties
    public Checking(String name){
        this.name = name;
        System.out.println("NEW CHECKING ACCOUNT");
        System.out.println("NAME: " + this.name);
    }

    //TODO:list any methods specifiic to the checking account
}
