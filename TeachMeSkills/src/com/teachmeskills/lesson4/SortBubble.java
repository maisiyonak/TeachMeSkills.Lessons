package com.teachmeskills.lesson4;

import java.util.Arrays;

public class SortBubble {

    public static void main(String[] args) {
        int[] arrSortBubble = {9, 8, 3, 1, 6, 4, 5, 6};
        System.out.println("Исходный массив:         " + Arrays.toString(arrSortBubble));

        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arrSortBubble.length -1; i++) {
                if (arrSortBubble[i] > arrSortBubble[i + 1]) {
                    sorted = false;
                    int x = arrSortBubble[i];
                    arrSortBubble[i] = arrSortBubble[i+1];
                    arrSortBubble[i + 1] = x;
                }
            }

        }
        System.out.println("Отсортированный массив: " + Arrays.toString(arrSortBubble));
    }
}
