package com.teachmeskills.lesson7.accounting;

import java.util.Date;

public abstract class Register {
    private int numberOfContract;
    private Date dateOfDocument;
    private Register[] registers = new Register[10];
    public Register(int numberOfContract, Date dateOfDocument) {
        this.numberOfContract = numberOfContract;
        this.dateOfDocument = dateOfDocument;
    }
    public Register() {
    }

    public Register[] getRegisters() {
        return registers;
    }

    public void setRegisters(Register[] registers) {
        this.registers = registers;
    }

    public void saveDocument(Register register) {
        for (int i = 0; i < registers.length; i++) {
            if (registers[i] == null) {
                registers[i] = register;
                break;
            } else if (i == registers.length - 1) {
                System.out.println("Массив заполнен");
            }
        }
    }

    public int getNumberOfContract() {
        return numberOfContract;
    }

    public void showInfoAboutDocument(int numberOfContract) {
        boolean isDocumentFound = false;
        for (Register register : registers) {
            if (register != null){
                if (register.getNumberOfContract() == numberOfContract){
                    System.out.println(register);
                    isDocumentFound = true;
                }
            }
        }
        if (isDocumentFound == false) {
            System.out.println("Такого номера договора не существует");
        }
    }

    @Override
    public String toString() {
        return  "Номер документа:" + numberOfContract + ", дата документа:" + dateOfDocument;
    }
}