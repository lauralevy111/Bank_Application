package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class CSV {

    //function that reads data from CSV file & returns a list
    public static List<String[]> read(String filePath){
        List<String[]> data = new LinkedList<String []>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
    }

}
