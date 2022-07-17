package com.teachmeskills.lesson5;

public class ArrayChess {
    public static void main(String[] args) {
        String[][] arrChess = new String[8][8];
        for (int i=0; i < arrChess.length; i++) {
            for (int j=0; j < arrChess.length; j = j + 2) {
                if (i % 2 == 0){
                    arrChess[i][j] = "W ";
                    arrChess[i][j+1] = "B ";
                } else {
                    arrChess[i][j] = "B ";
                    arrChess[i][j+1] = "W ";
                }
                System.out.print(arrChess[i][j]);
                System.out.print(arrChess[i][j+1]);
            }
            System.out.println();
        }
    }
}