package com.company;

import java.util.Date;

public class Employee {

    private long password;
    private String name;
    private int mojaz = 3;

    public Employee(String name, long password){
        this.password = password;
        this.name = name;
    }

    public void morakhasi(){

        if (mojaz > 0){
            System.out.println("Accepted");
            mojaz--;
            System.out.println("Opportunity Left : " +mojaz);
        }
        else{
            System.out.println("You Can't");
        }

    }

    public void reserve(String lunch, String dinner) {
        System.out.println("Your Lunch Is : " +lunch+ "\nYour Dinner Is : " +dinner);
    }

    public void exit(){
        System.out.println("");
    }

    public long getter(){
        return this.password;
    }

    public String getName(){
        return name;
    }


}

