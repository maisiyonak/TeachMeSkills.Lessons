package com.teachmeskills.lesson6;

public class ComputerRAM {
    String nameRAM;
    int sizeRAM;
    public String getNameRAM() {
        return nameRAM;
    }
    public void setNameRAM(String nameRAM) {
        this.nameRAM = nameRAM;
    }
    public int getSizeRAM() {
        return sizeRAM;
    }
    public void setSizeRAM(int sizeRAM) {
        this.sizeRAM = sizeRAM;
    }
    public ComputerRAM(String nameRAM, int volumeRAM) {
        this.nameRAM = nameRAM;
        this.sizeRAM = volumeRAM;
    }
    public String toString()
    {
        return "RAM(name:" + nameRAM + ", " + "size:" + sizeRAM + ")";
    }
}