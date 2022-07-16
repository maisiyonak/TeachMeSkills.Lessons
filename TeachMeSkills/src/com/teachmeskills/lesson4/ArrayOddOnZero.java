package com.teachmeskills.lesson4;

import java.util.Arrays;

public class ArrayOddOnZero {
    public static void main(String[] args) {
        int[] ArrOddOnZero = {9, 8, 3, 1, 6, 4, 5, 6};
        System.out.println("Исходный массив:    " + Arrays.toString(ArrOddOnZero));
        int[] ArrZero = {0};
        for (int i = 0; i < ArrOddOnZero.length; i++){
            System.arraycopy(ArrOddOnZero,i,ArrOddOnZero,i,1);
            i = i + 1;
            if (i < ArrOddOnZero.length) {
                System.arraycopy(ArrZero,0,ArrOddOnZero,i,1);
            }
        }
        System.out.println("Измененный массив:  " + Arrays.toString(ArrOddOnZero));
    }
}
