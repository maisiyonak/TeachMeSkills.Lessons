package com.teachmeskills.lesson7.accounting;

import java.util.Date;

public class EmployeeContract extends Register {
    private Date dateEnd;
    private String nameEmployee;
    public EmployeeContract(int numberOfContract, Date date, Date dateEnd, String nameEmployee) {
        super(numberOfContract, date);
        this.dateEnd = dateEnd;
        this.nameEmployee = nameEmployee;
    }
    public EmployeeContract() {
    }

    @Override
    public String toString() {
        return super.toString() + ", дата окончания контракта:" + dateEnd + ", имя сотрудника:" + nameEmployee;
    }
}