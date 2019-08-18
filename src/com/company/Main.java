package com.company;

import com.company.paris.Bus;
import com.company.paris.MoyenDeLocomotion;
import com.company.paris.Parisien;
import com.company.paris.Taxi;

public class Main {

    public static void main(String[] args) {
        // write your code here
           /* Product cafe= new Product("Philips 02564H2C/85","Philis X500,Noir ",79.990);
            Product tv= new Television("TV SAMSUNG","SMART TV LED curvée",999,49,"LED");
            Fridge fridge = new Fridge("BEKO 1052","Réfrégérateur BEKO",389,130,false);


            Customer customer = new Customer("Julia LeBlanc","19 rue Tunis Sousse 4081");
            Bill bill = new Bill(customer);
            bill.addProduct(cafe,1);
            bill.addProduct(tv,1);
            bill.addProduct(fridge,25);
            Vehicle v = new Bike();*/
        Parisien segolone = new Parisien();
        Bus bus = new Bus();
        segolone.seDeplacer(bus);
        Taxi taxi = new Taxi();
        segolone.seDeplacer(taxi);
        MoyenDeLocomotion taxi2 = new Taxi();
        segolone.seDeplacer(taxi2);

    }

}
