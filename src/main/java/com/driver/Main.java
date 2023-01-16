package com.driver;

import java.sql.SQLOutput;
public class Main {
    private static void main(String[] args){
        RWOnly obj = new RWOnly();
        obj.setName("Sahil");
        System.out.println("Error:you might seen some error,please not it down in comments");
        obj.getName();
    }
  
}