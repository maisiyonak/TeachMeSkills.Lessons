package com.teachmeskills.lesson5;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.random;

public class ArrayTowSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива (длина ширина):");
        int lengthConsole = scanner.nextInt();
        int widthConsole = scanner.nextInt();
        int[][] arrSortFromConsole = new int[lengthConsole][widthConsole];
        for (int i = 0; i < arrSortFromConsole.length; i++) {
            for (int j = 0; j < arrSortFromConsole[i].length; j++) {
                arrSortFromConsole[i][j] = (int) (random() * 10);
            }
            Arrays.sort(arrSortFromConsole[i]);
            for (int j = 0; j < arrSortFromConsole[i].length; j++) {
                System.out.print(arrSortFromConsole[i][j] + " ");
            }
            System.out.println();
        }
    }
}