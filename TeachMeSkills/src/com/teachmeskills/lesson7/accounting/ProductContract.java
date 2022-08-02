package com.teachmeskills.lesson7.accounting;

import java.util.Date;

public class ProductContract extends Register {
    private String typeOfProduct;
    private int amount;
    public ProductContract(int numberOfContract, Date date, String typeOfProduct, int amount) {
        super(numberOfContract, date);
        this.typeOfProduct = typeOfProduct;
        this.amount = amount;
    }
    public ProductContract() {
    }

    @Override
    public String toString() {
        return super.toString() + ", тип товара:" + typeOfProduct + ", количество товара:" + amount;
    }
}
