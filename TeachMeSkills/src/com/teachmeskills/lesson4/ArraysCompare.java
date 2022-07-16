package com.teachmeskills.lesson4;

import java.util.Arrays;

public class ArraysCompare {
    public static void main(String[] args) {
        int numAverageFirst = 0;
        int numAverageSecond = 0;
        int[] arrFirst = new int[5];
        for (int i = 0; i < arrFirst.length; i++) {
            arrFirst[i] = (i + 1) * i;
            numAverageFirst = numAverageFirst + arrFirst[i];
        }
        numAverageFirst = numAverageFirst / 5;
        int[] arrSecond = new int[5];
        for (int i = 0; i < arrSecond.length; i++) {
            arrSecond[i] = i + 1 * i;
            numAverageSecond = numAverageSecond + arrSecond[i];
        }
        numAverageSecond = numAverageSecond / 5;
        System.out.println("Массив №1:                      " + Arrays.toString(arrFirst));
        System.out.println("Массив №2:                      " + Arrays.toString(arrSecond));
        System.out.println("Среднее значение из массива №1: " + numAverageFirst);
        System.out.println("Среднее значение из массива №2: " + numAverageSecond);
        if (numAverageFirst < numAverageSecond) {
            System.out.println("Среднее значение из массива №2 больше среднего значения из массива №1");
        } else if (numAverageFirst > numAverageSecond) {
            System.out.println("Среднее значение из массива №1 больше среднего значения из массива №2");
        } else {
            System.out.println("Среднее значение из массива №1 равно среднему значению из массива №2");
        }
    }
}
