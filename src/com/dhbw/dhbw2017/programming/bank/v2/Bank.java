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


    public static void main(String[] args) {
        // create 100 initial accounts

        // new customer
        // old implementation int accountNumberCustomer1 = createAccount();
        Account accountCustomer1 = new Account();
        // customer wants to deposit 50 EUR
        // old implementation: deposit(accountNumberCustomer1, 50.00);
        accountCustomer1.deposit(50.00);
        // customer wants to know the balance of his account.
        // old implementation: printBalance(accountNumberCustomer1);
        accountCustomer1.printBalance();
        // the customer wants to withdraw 30 EUR from his account
       // old implementation:  withdraw(accountNumberCustomer1,30.00);
       accountCustomer1.withdraw(30);
        // the customer wants to transfer 25 EUR to the account with the number v2
        // old implementation = transfer(accountNumberCustomer1,2,25);
        Account receivingAccount = new Account();
        accountCustomer1.transfer(receivingAccount,25);

        // the bank employee wants to add the interest for all accounts at the end of the year
        // print the balance of all accounts before the interest calculation
        // The interest rate is 2.5%
        // print the balance of all accounts after the interest calculation
        calculateInterest(2.5f);
    }

    public static void calculateInterest(float interestRate){
        Account[] accounts = Account.getAccounts();
        for (Account a:accounts){
            if(a!=null) {
                System.out.println("Before interest calculation");
                a.printBalance();
                a.deposit(a.checkBalance() * (interestRate / 100));
                System.out.println("After interest calculation");
                a.printBalance();
            }
        }
    }






    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Name of the Bank "+ this.name+" was changed to "+name);
        this.name = name;
    }
}
