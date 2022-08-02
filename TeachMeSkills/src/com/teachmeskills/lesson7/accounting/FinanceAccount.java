package com.teachmeskills.lesson7.accounting;

import java.util.Date;

public class FinanceAccount extends Register {
    private double sumOfMonth;
    private int codeOfDepartment;
    public FinanceAccount(int numberOfContract, Date date, double sumOfMonth, int codeOfDepartment) {
        super(numberOfContract, date);
        this.sumOfMonth = sumOfMonth;
        this.codeOfDepartment = codeOfDepartment;
    }
    public FinanceAccount() {
    }

    @Override
    public String toString() {
        return super.toString() + ", итоговая сумма за месяц:" + sumOfMonth + ", код департамента:" + codeOfDepartment;
    }
}
