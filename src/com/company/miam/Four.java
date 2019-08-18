package com.company.miam;

public class Four {
    int puissance;
    int capacité;
    private Resistance resistance;
    private Soufflerie soufflerie;

    public void cuire(Aliment aliment){
        System.out.println("Je cuis un aliment");
        System.out.println("avec ma capacité de " + capacité+ " litres");
        System.out.println("et ma puissance de " + puissance+ " degré");
        aliment.estCuit=true;
    }
    private void maintenir(){
    }
    public int getPuissance(){
        return  puissance;
    }

    public void setCapacité(int capacité) {
        this.capacité = capacité;
    }

    public Resistance getResistance() {
        return resistance;
    }

    public Soufflerie getSoufflerie() {
        return soufflerie;
    }

    public void setPuissance(int puissance){
        System.out.println("la puissance est modifié");
        this.puissance=puissance;
    }
}
