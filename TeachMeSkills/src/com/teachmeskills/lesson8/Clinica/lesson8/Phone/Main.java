package com.teachmeskills.lesson8.Clinica.lesson8.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phoneOne = new Phone(111_11_11,"apple", 0.25);
        Phone phoneTwo = new Phone(222_22_22,"samsung", 0.26);
        Phone phoneThree = new Phone(333_33_33,"huawei", 0.27);
        System.out.println(phoneOne + "\n" + phoneTwo + "\n" + phoneThree);
        phoneOne.receiveCall("Петя");
        phoneOne.receiveCall("Петя", phoneOne.getNumber());
        phoneOne.sendMessage(new int[]{1000000,1100000,1110000});


    }
}