package com.dhbw.dhbw2017.programming.bank.v2;

/**
 * Created by flori on 22.03.2017.
 */
public class Account {

    private static Account[] accounts = new Account[1000];
    private static int lastAccountNumber = 0;

    private int accountNumber;
    private double balance;

    public Account(){
        balance= 0.00;
        accountNumber=++lastAccountNumber;
        accounts[accountNumber]=this;
        System.out.println("Number of the created account is: "+ lastAccountNumber);
    }


    public void deposit( double amount){
        balance += amount;
        System.out.println("Succesfully added "+amount+"EUR to the account "+accountNumber);
    }

    public void printBalance(){
        System.out.println("The balance of account "+accountNumber+" is "+checkBalance()+" EUR"); ;
    }
    public double checkBalance(){
        return balance;
    }

    public  void withdraw(double amount){

        if(checkBalance()-amount>0){
            balance -= amount;
            System.out.println("Successfully withdrawn "+amount+"EUR from the account "+accountNumber);
        }else{
            System.out.println("Unsufficient funds");
        }

    }


    public void transfer( Account receivingAccount, double amount){
        if(checkBalance()-amount>0){
            withdraw(amount);
            receivingAccount.deposit(amount);
        }else{
            System.out.println("Unsufficient funds");
        }
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static Account[] getAccounts() {
        return accounts;
    }

    public static void setAccounts(Account[] accounts) {
        Account.accounts = accounts;
    }
}
