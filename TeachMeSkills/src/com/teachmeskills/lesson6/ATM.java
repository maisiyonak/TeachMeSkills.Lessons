package com.teachmeskills.lesson6;

import java.util.Scanner;

public class ATM {
    int cash20;
    int cash50;
    int cash100;
    int reduceCash20;
    int reduceCash50;
    int reduceCash100;
    public ATM(int cash20, int cash50, int cash100) {
        this.cash20 = cash20;
        this.cash50 = cash50;
        this.cash100 = cash100;
    }
    public void addCash(int addCash20, int addCash50, int addCash100){
        this.cash20 = cash20 + addCash20;
        this.cash50 = cash50 + addCash50;
        this.cash100 = cash100 + addCash100;
    }
    public void reduceCash(){
        System.out.println("Введите сумму, купюры для выдачи наминалом 20, 50, 100");
        Scanner scanner = new Scanner(System.in);
        int sumConsole = scanner.nextInt();
        while (sumConsole %10 != 0 && sumConsole != 0 && sumConsole != 10 && sumConsole != 30){
            System.out.println("Введите другую сумму");
            sumConsole = scanner.nextInt();
            }
        reduceCash100=0;
        while (reduceCash100<cash100 && 100*(reduceCash100+1)<= sumConsole){
            if (sumConsole - 100 * reduceCash100 == 110 || sumConsole - 100 * reduceCash100 == 130){
                break;
            }
            reduceCash100 += 1;
        }
        reduceCash50=0;
        while (reduceCash50<cash50 && 50*(reduceCash50+1)<=(sumConsole -100*reduceCash100)){
            if (sumConsole - 100 * reduceCash100 - 50 * reduceCash50 == 80 || sumConsole - 100 * reduceCash100 == 60){
                break;
            }
            reduceCash50 += 1;
        }
        reduceCash20=0;
        while (reduceCash20<cash20 && 20*(reduceCash20+1)<=(sumConsole -100*reduceCash100-50*reduceCash50)){
            reduceCash20 += 1;
        }
        System.out.println(reduceCash100 + " купюр наминалом 100");
        System.out.println(reduceCash50 + " купюр наминалом 50");
        System.out.println(reduceCash20 + " купюр наминалом 20");
    }
}