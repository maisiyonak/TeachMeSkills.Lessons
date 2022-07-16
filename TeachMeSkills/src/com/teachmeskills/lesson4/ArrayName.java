package com.teachmeskills.lesson4;

import java.util.Arrays;

public class ArrayName {
    public static void main(String[] args) {
        String[] arrName = new String[6];
        arrName[0] = "Вася";
        arrName[1] = "Петя";
        arrName[2] = "Гена";
        arrName[3] = "Ибрагим Павлович";
        arrName[4] = "Джон";
        arrName[5] = "Дон";

        Arrays.sort(arrName);

        for (int i = 0; i < arrName.length; i++) {
            System.out.println(arrName[i]);
        }
    }
}

