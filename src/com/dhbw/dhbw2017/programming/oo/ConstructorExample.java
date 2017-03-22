package com.dhbw.dhbw2017.programming.oo;

import com.dhbw.dhbw2017.programming.bank.v2.Bank;

/**
 * Created by flori on 22.03.2017.
 */
public class ConstructorExample {

    public static void main(String[] args){
        Bank bank = new Bank(); // default constructor
        System.out.println(bank.getName());

        Bank bank2 = new Bank("DHBW Bank");
        System.out.println(bank2.getName());
    }
}
