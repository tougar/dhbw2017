package com.dhbw.dhbw2017.programming.bank.v2;

/**
 * Created by flori on 22.03.2017.
 */
public class Bank {

    private String name;

    public Bank(){
        name="Unnamed Bank";
    }

    public Bank(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Name of the Bank "+ this.name+" was changed to "+name);
        this.name = name;
    }
}
