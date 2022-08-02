package com.teachmeskills.lesson7.accounting;

import java.util.Date;

public class Main {
    public static void main (String [] args) {
        Register register = new EmployeeContract(12, new Date(2022 - 1900,6,30),
                new Date(2023 - 1900,6,30), "Иванов") ;
        Register register1 = new FinanceAccount(11, new Date(2022 - 1900,6,30),
                1000200, 15) ;
        Register register2 = new ProductContract(13, new Date(2022 - 1900,6,30),
                "книги", 1000) ;
        register.saveDocument(register);
        register.saveDocument(register1);
        register.saveDocument(register2);
        register.showInfoAboutDocument(11);
        register.showInfoAboutDocument(12);
        register.showInfoAboutDocument(13);
        register.showInfoAboutDocument(14);
    }
}