package com.teachmeskills.lesson6;

public class ComputerHDD {
    String nameHDD;
    int sizeHDD;
    String typeHDD;
    public String getNameHDD() {
        return nameHDD;
    }
    public void setNameHDD(String nameHDD) {
        this.nameHDD = nameHDD;
    }
    public int getSizeHDD() {
        return sizeHDD;
    }
    public void setSizeHDD(int sizeHDD) {
        this.sizeHDD = sizeHDD;
    }
    public String getTypeHDD() {
        return typeHDD;
    }
    public void setTypeHDD(String typeHDD) {
        this.typeHDD = typeHDD;
    }
    public ComputerHDD(String nameHDD, int volumeHDD, String typeHDD){
        this.nameHDD = nameHDD;
        this.sizeHDD = volumeHDD;
        this.typeHDD = typeHDD;
    }
    public String toString()
    {
        return "HDD(name:" + nameHDD + ", " + "size:" + sizeHDD + ", " + "type:" + typeHDD + ")";
    }
}