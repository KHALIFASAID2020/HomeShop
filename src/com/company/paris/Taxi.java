package com.company.paris;

public class Taxi implements MoyenDeLocomotion {
    @Override
    public void deplace(String adresse) {
        System.out.println("je suis un Taxi et je vais ) l'adress  "+adresse);

    }
}
