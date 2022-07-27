package com.teachmeskills.lesson6;

public class CreditCard {
    String accountNumber;
    double accountBalance;
    public CreditCard(String accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }
    public void addAccountBalance(double accountBalance){
        this.accountBalance += accountBalance;
    }
    public void reduceAccountBalance(double accountBalance){
        this.accountBalance -= accountBalance;
    }
    public void printAccountBalance(){
        System.out.println(accountNumber + " : " + accountBalance);
    }
}