package com.teachmeskills.lesson6;

public class TestATM {
    public static void main (String [] args) {

        ATM atm = new ATM(100,100,10);
        atm.addCash(100, 100, 10, 2,2,2);
        atm.reduceCash();

    }
}
