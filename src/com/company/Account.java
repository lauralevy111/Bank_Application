package com.company;

public abstract class Account implements IRate {
    //list common properties for savings and checking acccounts.
    public String name;

    //constructor: setbase properties and initialize the account
    public Account (String name) {
        this.name = name;

        System.out.println("NEW ACCOUNT " +
                "\n*NAME: "+ this.name);

    }

    //TODO: List common methods
}
