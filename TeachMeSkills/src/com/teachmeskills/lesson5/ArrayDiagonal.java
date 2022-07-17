package com.teachmeskills.lesson5;

import java.util.Scanner;
import static java.lang.Math.random;

public class ArrayDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива (длина ширина):");
        int lengthConsole = scanner.nextInt();
        int widthConsole = scanner.nextInt();
        int[][] arrDiagonalFromConsole = new int[lengthConsole][widthConsole];
        for (int i = 0; i < arrDiagonalFromConsole.length; i++) {
            for (int j = 0; j < arrDiagonalFromConsole[i].length; j++) {
                arrDiagonalFromConsole[i][j] = (int) (random() * 10);
                if (i == j || lengthConsole - i - 1 == j) {
                    System.out.print(arrDiagonalFromConsole[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}