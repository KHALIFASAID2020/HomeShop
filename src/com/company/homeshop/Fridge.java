package com.company.homeshop;

public class Fridge extends  Product {
    private int litre;
    private boolean freezer;
    public Fridge(String name, String description, double price, int litre, boolean freezer) {
        super(name, description, price);
        this.litre = litre;
        this.freezer = freezer;
    }

    public int getLitre() {
        return litre;
    }

    public boolean isFreezer() {
        return freezer;
    }
}
