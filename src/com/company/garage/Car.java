package com.company.garage;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {
    private int door;
    private int litreConsommation;
    private String motor;
    private List<String> options = new ArrayList<String>();

    public Car(String modelName, String description, String manufacturer, int yeah, String color, int speed, int[] dimensions, int weight) {
        super(modelName, description, manufacturer, yeah, color, speed, dimensions, weight);
    }

    public Car(String modelName, String description, String manufacturer, int yeah, String color, int speed, int[] dimensions, int weight, int door, int litreConsommation, String motor, List<String> options) {
        super(modelName, description, manufacturer, yeah, color, speed, dimensions, weight);
        this.door = door;
        this.litreConsommation = litreConsommation;
        this.motor = motor;
        this.options = options;
    }

    @Override
    public void start() {
        System.out.println("Je suis " + modelName + " et je  démarre");
    }

    @Override
    public void stop() {
        System.out.println("Je suis " + modelName + " et je m'arrête");
    }


    public void startHeadLight(){
        System.out.println("J'allume mes phares");
    }
    public void openTrunk(){
        System.out.println("J'ouvre mon coffre");
    }

    public int getDoor() {
        return door;
    }

    public int getLitreConsommation() {
        return litreConsommation;
    }

    public String getMotor() {
        return motor;
    }

    public List<String> getOptions() {
        return options;
    }
}
