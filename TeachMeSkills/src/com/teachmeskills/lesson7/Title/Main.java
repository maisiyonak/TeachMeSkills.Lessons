package com.teachmeskills.lesson7.Title;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = {new Accountant(), new Director(), new Worker()};
        for (Printable printable : printables){
            printable.printTitle();
        }
    }
}
