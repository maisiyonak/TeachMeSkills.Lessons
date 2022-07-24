package com.teachmeskills.lesson6;

public class ActionsWithCreditCard {

    public static void main (String [] args) {
        CreditCard firstCreditCard = new CreditCard("0000_0000_0000_0001", 1000.00);
        CreditCard secondCreditCard = new CreditCard("0000_0000_0000_0002", 1000.00);
        CreditCard thirdCreditCard = new CreditCard("0000_0000_0000_0003", 1000.00);
        firstCreditCard.addAccountBalance(1_000.50);
        secondCreditCard.addAccountBalance(100.00);
        thirdCreditCard.reduceAccountBalance(200.50);
        System.out.println("номер счета         : сумма на счету");
        firstCreditCard.printAccountBalance();
        secondCreditCard.printAccountBalance();
        thirdCreditCard.printAccountBalance();
    }
}
