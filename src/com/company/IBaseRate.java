package com.company;

public interface IBaseRate {

    //method that returns base rate
    default double getBaseRate(){
        return 2.5;
    }
}
