package com.teachmeskills.lesson8.Clinica;

public class Surgeon implements Treatable {
    @Override
    public void treat() {
        System.out.println("Вас будет лечить хирург");
    }
}