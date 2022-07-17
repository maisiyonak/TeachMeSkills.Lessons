package com.teachmeskills.lesson5;

import java.util.Scanner;

public class ArrayIncreasedEachNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число на которое нужно увеличить каждый элемент массива.");
        int numConsole = scanner.nextInt();
        System.out.println("Вы ввели число: " + numConsole);
        int [][][] arrIncreasedEachNumber = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 5, 9}, {7, 8, 9, 6}}};
        for (int i=0; i < arrIncreasedEachNumber.length; i++) {
            for (int j = 0; j < arrIncreasedEachNumber[i].length; j++) {
                for (int k = 0; k < arrIncreasedEachNumber[i][j].length; k++) {
                    arrIncreasedEachNumber[i][j][k] = arrIncreasedEachNumber[i][j][k] + numConsole;
                    System.out.print(arrIncreasedEachNumber[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}