package com.teachmeskills.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFromSixToTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива (от 6 до 10).");
        int numConsoleFromSixToTen = scanner.nextInt();
        while (numConsoleFromSixToTen < 6 || numConsoleFromSixToTen > 10) {
            System.out.println("Вы ввели неправильное значение!");
            System.out.println("Введите размер массива (от 6 до 10).");
            numConsoleFromSixToTen = scanner.nextInt();
        }
        System.out.println("Вы ввели число: " + numConsoleFromSixToTen);
        int[] arrFromSixToTen = new int[numConsoleFromSixToTen];
        for (int i = 0; i < arrFromSixToTen.length; i++) {
            arrFromSixToTen[i] = (int) (Math.random() * 10);
        }
        int dividesByTwo = 0;
        for (int i = 0; i < arrFromSixToTen.length; i++) {
            if (arrFromSixToTen[i] % 2 == 0) {
                dividesByTwo = dividesByTwo + 1;
            }
        }
        int[] newArrFromSixToTen = new int[dividesByTwo];
        int j = -1;
        for (int i = 0; i < arrFromSixToTen.length; i++) {
            j = j + 1;
            if (arrFromSixToTen[i] % 2 == 0) {
                System.arraycopy(arrFromSixToTen,i,newArrFromSixToTen,j,1);
            } else {
                j = j - 1;
            }
        }
        System.out.println("Исходный массив" + Arrays.toString(arrFromSixToTen));
        if (dividesByTwo > 0) {
            System.out.println("Массив из четных чисел" + Arrays.toString(newArrFromSixToTen));
        } else {
            System.out.println("В исходном массиве четных чисел нет");
        }
    }
}


