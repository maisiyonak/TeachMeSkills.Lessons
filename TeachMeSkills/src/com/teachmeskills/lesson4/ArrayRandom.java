package com.teachmeskills.lesson4;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

public class ArrayRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива.");
        int numRandomConsole = scanner.nextInt();
        double numMax = 0;
        double numMin = 1;
        double numAverage = 0;
        double[] arrRandom = new double[numRandomConsole];
        for (int i = 0; i < arrRandom.length; i++) {
            arrRandom[i] = Math.random();
            if (numMax < arrRandom[i]) {
                numMax = arrRandom[i];
            }
            if (numMin > arrRandom[i]) {
                numMin = arrRandom[i];
            }
            numAverage = numAverage + arrRandom[i];
        }
        numAverage = numAverage / numRandomConsole;
        System.out.println(Arrays.toString(arrRandom));
        System.out.println("Максимальное значение из массива:   " + numMax);
        System.out.println("Минимальное значение из массива:    " + numMin);
        System.out.println("Среднее значение из массива:        " + numAverage);
    }
}