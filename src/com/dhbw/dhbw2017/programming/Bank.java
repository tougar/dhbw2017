package com.dhbw.dhbw2017.programming;

public class Bank {

    public static double[] accounts = new double[1000];

    public static int numberOfAccounts = 0;

    /**
     * @param args
     */
    public static void main(String[] args) {
        // create 100 initial accounts

        // new customer
        int accountNumberCustomer1 = createAccount();
        // customer wants to deposit 50 EUR
        deposit(accountNumberCustomer1, 50.00);
        // customer wants to know the balance of his account.
        printBalance(accountNumberCustomer1);
        // the customer wants to withdraw 30 EUR from his account
        withdraw(accountNumberCustomer1,30.00);
        // the customer wants to transfer 25 EUR to the account with the number 2
        transfer(accountNumberCustomer1,2,25);
        // the bank employee wants to add the interest for all accounts at the end of the year
        // print the balance of all accounts before the interest calculation
        // The interest rate is 2.5%
        // print the balance of all accounts after the interest calculation
        calculateInterest(2.5f);
    }


    public static int createAccount(){
        accounts[numberOfAccounts] = 0.00;
        System.out.println("Number of the created account is: "+ numberOfAccounts);
        return numberOfAccounts++;
    }

    public static void deposit(int accountNumber, double amount){
        accounts[accountNumber] += amount;
        System.out.println("Succesfully added "+amount+"EUR to the account "+accountNumber);
    }

    public static void printBalance(int accountNumber){
        System.out.println("The balance of account "+accountNumber+" is "+checkBalance(accountNumber)+" €"); ;
    }
    public static double checkBalance(int accountNumber){
        return accounts[accountNumber];
    }

    public static void withdraw(int accountNumber, double amount){

        if(checkBalance(accountNumber)-amount>0){
            accounts[accountNumber]-=amount;
            System.out.println("Successfully withdrawn "+amount+"€ from the account "+accountNumber);
        }else{
            System.out.println("Unsufficient funds");
        }

    }

    public static void transfer(int sendingAccountNumber, int receivinAccountNumber, double amount){
        if(checkBalance(sendingAccountNumber)-amount>0){
            accounts[sendingAccountNumber]-=amount;
            accounts[receivinAccountNumber]+=amount;
            System.out.println("Successfully transfered "+amount+"€ from the account "+sendingAccountNumber + " to the account "+receivinAccountNumber);
        }else{
            System.out.println("Unsufficient funds");
        }
    }

    public static void calculateInterest(float interestRate){
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Before interest calculation");
            printBalance(i);
            accounts[i]*= 1+(interestRate/100);
            System.out.println("After interest calculation");
            printBalance(i);
    }
    }

}

