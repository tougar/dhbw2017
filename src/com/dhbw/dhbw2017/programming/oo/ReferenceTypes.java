package com.dhbw.dhbw2017.programming.oo;

import com.dhbw.dhbw2017.programming.bank.v2.Bank;

/**
 * Created by flori on 22.03.2017.
 */
public class ReferenceTypes {

    public static void main(String[] args){
        Bank b1 = new Bank(); // create a new object
        Bank b2 = b1; // copy the reference to another variable


        b2.setName("DHBW Bank"); // modify the value of a attribute of the object

        System.out.println(b1.getName()); // access the value of the object -> same for both variables
        System.out.println(b2.getName()); // access the value of the object -> same for both variables

        b1.setName(null);

        b1 = null;
        b2 = null; // unassign all references to an object in order to have it removed by the Garbage collector

    }
}
