package com.teachmeskills.lesson5;

import java.util.Scanner;
import static java.lang.Math.random;

public class ArraySumAllElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива (длина ширина):");
        int lengthConsole = scanner.nextInt();
        int widthConsole = scanner.nextInt();
        int[][] arrSumAllElements = new int[lengthConsole][widthConsole];
        int sumAllElements = 0;
        for (int i=0; i < arrSumAllElements.length; i++) {
            for (int j = 0; j < arrSumAllElements[i].length; j++) {
                arrSumAllElements[i][j] = (int) (random() * 10);
                sumAllElements = sumAllElements + arrSumAllElements[i][j];
                System.out.print(arrSumAllElements[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма всех элементов массива = " + sumAllElements);
    }
}