package com.zorax;

public class Car extends Vihicle {
    private int doors;
    private int wheels;
    private String model;
    private int engineSize;
    private String colour;
    private int speed;

    public Car() {
        //this("reacreational",4, 4, String model, int engineSize, String colour, 5);
    }

    public Car(String typeOfUse, int doors, int wheels, String model, int engineSize, String colour, int speed) {
        super("engine", typeOfUse);
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.engineSize = engineSize;
        this.colour = colour;
        this.speed = speed;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getModel() {
        return model;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public String getColour() {
        return colour;
    }

    public int getSpeed() {
        return speed;
    }

    public void setDoors(int doors) {

        this.doors = doors;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void getVihicleInfo() {
        System.out.println("Car.getVihicleInfo() - invoked");
        super.getVihicleInfo();
        System.out.println("Number of doors: " +getDoors());
        System.out.println("MAX Speed: " + getSpeed() );
    }
}
