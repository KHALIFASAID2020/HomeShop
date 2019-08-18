package com.company.miam;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Four grandFour = new Four();
        grandFour.capacité=55;
        grandFour.puissance=200;
      //  grandFour.soufflerie=null;
        // grandFour.resistance=null;

        Aliment cake = new Aliment();
        cake.nom="cake aux fruits";
        cake.estCuit=false;
        cake.manger();
        grandFour.cuire(cake);
        System.out.println("---------");
        cake.manger();
    }
}
