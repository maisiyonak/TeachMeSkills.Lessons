package com.teachmeskills.lesson8.Clinica.lesson8.Clinica;

public class Therapist implements Treatable {
    @Override
    public void treat() {
        System.out.println("Вас будет лечить терапевт");
    }
}
