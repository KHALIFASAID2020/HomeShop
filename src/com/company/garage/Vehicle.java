package com.company.garage;

public abstract class Vehicle {
        protected String modelName;
        private String description;
        private String manufacturer;
        private int year;
        private String color;
        private int speed;
        private int[] dimensions = new int[3];
        private int weight;

    public Vehicle() {
    }

    public Vehicle(String modelName, String description, String manufacturer, int yeah, String color, int speed, int[] dimensions, int weight) {
            this.modelName = modelName;
            this.description = description;
            this.manufacturer = manufacturer;
            this.year = year;
            this.color = color;
            this.speed = speed;
            this.dimensions = dimensions;
            this.weight = weight;
        }

        public abstract  void start();
        public abstract  void stop();


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int[] getDimensions() {
        return dimensions;
    }

    public void setDimensions(int[] dimensions) {
        this.dimensions = dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}