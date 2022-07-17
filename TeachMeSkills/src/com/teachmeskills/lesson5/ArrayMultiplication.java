package com.teachmeskills.lesson5;

public class ArrayMultiplication {
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int p = 3;
        int[][] matrixOne = new int[n][m];
        int[][] matrixTwo = new int[m][p];
        int[][] matrixThree = new int[n][p];
        matrixOne[0] = new int[]{1, 0, 0, 0};
        matrixOne[1] = new int[]{0, 1, 0, 0};
        matrixOne[2] = new int[]{0, 0, 0, 0};
        matrixTwo[0] = new int[]{1, 2, 3};
        matrixTwo[1] = new int[]{1, 1, 1};
        matrixTwo[2] = new int[]{0, 0, 0};
        matrixTwo[3] = new int[]{2, 1, 0};
        System.out.println("Если матрицу №1:");
        for (int i=0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("умножить на матрицу №2:");
        for (int j=0; j < matrixTwo.length; j++) {
            for (int k = 0; k < matrixTwo[j].length; k++) {
                System.out.print(matrixTwo[j][k] + " ");
            }
            System.out.println();
        }
        System.out.println("получится матрица №3:");
        for (int i=0; i < matrixThree.length; i++) {
            for (int k = 0; k < matrixThree[i].length; k++) {
            }
        }
        for (int i=0; i < n; i++) {
            for (int k=0; k < p; k++) {
                for (int j=0; j < m; j++) {
                    matrixThree[i][k] = matrixThree[i][k] + matrixOne[i][j] * matrixTwo[j][k];
                }
                System.out.print(matrixThree[i][k] + " ");
            }
            System.out.println();
        }
    }
}