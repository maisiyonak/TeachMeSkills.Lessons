package com.teachmeskills.lesson6;

public class TestComputer {
    public static void main (String [] args) {
        Computer computer1 = new Computer(2000.50, "Acer");
        Computer computer2 = new Computer(2100.50, "Asus",
                new ComputerHDD("HDD", 1_000, "external"),
                new ComputerRAM("RAM", 10));
        System.out.println(computer1);
        System.out.println(computer2);
    }
}