package com.teachmeskills.lesson8.Clinica.lesson8.Phone;

public class Phone {
    private  String name;
    private int number;
    private String model;
    private double weight;
    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + " с номера:" + number);
    }

    public String toString() {
        return "Номер телефона:" + getNumber() + ", модель:" + getModel() + ", вес:" + getWeight();
    }

    public void sendMessage(int[] arrayNumbers) {
        System.out.println("Сообщение будет отправлено на номера:");
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println(arrayNumbers[i]);
        }
    }
}