package com.teachmeskills.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntNum {
    public static void main (String[] args) {
        int[] arrInt = new int[5];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = i;
        }
        System.out.println(Arrays.toString(arrInt));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Необходимо удалить все вхождения заданного числа из вышеуказанного массива массива.");
        System.out.println("Введите число.");
        int numConsole = scanner.nextInt();
        System.out.println("Вы ввели число: " + numConsole);
        int x = 0;
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] == numConsole) {
                x = x + 1;
            }
        }
        if (x == 0){
            System.out.println("Такого числа в массиве нет.");
        } else {
            int[] newArrInt = new int[arrInt.length - x];
            int j = -1;
            for (int i = 0; i < arrInt.length; i++) {
                j = j + 1;
                    if (arrInt[i] != numConsole) {
                        System.arraycopy(arrInt,i,newArrInt,j,1);
                    } else {
                        i = i + 1;
                        if (i < arrInt.length) {
                            System.arraycopy(arrInt,i,newArrInt,j,1);
                        }
                    }
            }
            System.out.println(Arrays.toString(newArrInt));
        }
    }
}
