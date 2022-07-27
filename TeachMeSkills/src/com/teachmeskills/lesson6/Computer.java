package com.teachmeskills.lesson6;

public class Computer {
    double computerCost;
    String computerModel;
    ComputerHDD computerHDD;
    ComputerRAM computerRAM;
    public double getComputerCost() {
        return computerCost;
    }
    public void setComputerCost(double computerCost) {
        this.computerCost = computerCost;
    }
    public String getComputerModel() {
        return computerModel;
    }
    public void setComputerModel(String computerModel) {
        this.computerModel = computerModel;
    }
    public ComputerHDD getComputerHDD() {
        return computerHDD;
    }
    public void setComputerHDD(ComputerHDD computerHDD) {
        this.computerHDD = computerHDD;
    }
    public ComputerRAM getComputerRAM() {
        return computerRAM;
    }
    public void setComputerRAM(ComputerRAM computerRAM) {
        this.computerRAM = computerRAM;
    }
    public Computer(double computerCost, String computerModel){
        this.computerCost=computerCost;
        this.computerModel=computerModel;
    }
    public Computer(double computerCost, String computerModel, ComputerHDD computerHDD, ComputerRAM computerRAM){
        this.computerCost = computerCost;
        this.computerModel = computerModel;
        this.computerHDD = computerHDD;
        this.computerRAM = computerRAM;
    }
    public String toString()
    {
        return "Computer - cost:" + computerCost + ", " + "model:" + computerModel + ", " + computerRAM + ", "
                + computerHDD;
    }
}