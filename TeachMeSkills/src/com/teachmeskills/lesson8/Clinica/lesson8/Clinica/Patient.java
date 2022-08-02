package com.teachmeskills.lesson8.Clinica.lesson8.Clinica;

public class Patient {
    Surgeon surgeon = new Surgeon();
    Dentist dentist = new Dentist();
    Therapist therapist = new Therapist();

    public void appointDoctor(int codeOfTreat){
        if (codeOfTreat == 1) {
            surgeon.treat();
        } else if (codeOfTreat == 2) {
            dentist.treat();
        } else if (codeOfTreat == 3) {
            therapist.treat();
        }
    }
}