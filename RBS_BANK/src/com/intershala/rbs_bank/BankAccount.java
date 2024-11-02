package com.intershala.rbs_bank;

public class BankAccount {

    //attributes
    private int accountNumber;
    private double balance;

    public BankAccount (int accountNumber, double Initialbalance) {
        this.accountNumber = accountNumber;
        this.balance = Initialbalance;
    }

    //getters

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
        if (balance >= 0){
            this.balance = balance;
        }else {
            System.out.println("Invalid balance");
        }

    }


    public void deposit_amount(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount Deposited. New Balance: " + balance);
        } else {
            System.out.println("Invalid amount ");
        }
    }

    public void withdraw_amount(double amount) {
        if (amount > 0 && amount <= balance){
            balance = balance - amount;
            System.out.println("Amount Withdrawn. New Balance: " + balance);
        }else{
            System.out.println("Insufficient balance OR Invalid amount ");
        }
    }

    public void check_balance() {
        System.out.println("Your Current Balance: "+balance);
    }
}
