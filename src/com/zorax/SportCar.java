package com.zorax;

public class SportCar extends Car{
    private int gears;
    private int maxSpeed;
    private int maxSpeedInMin;
    private int brakePathLenght;

    public SportCar() {
    }

    public SportCar(String model,
                    int engineSize,
                    String colour,
                    int speed,
                    int gears,
                    int maxSpeed,
                    int maxSpeedInMin,
                    int brakePathLenght) {
        super("recreational", 2, 4, model, engineSize, colour, speed);
        this.gears = gears;
        this.maxSpeed = maxSpeed;
        this.maxSpeedInMin = maxSpeedInMin;
        this.brakePathLenght = brakePathLenght;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public void setMaxSpeed(int speed) {
        this.maxSpeed = speed;
    }

    public void setMaxSpeedInMin(int maxSpeedInMin) {
        this.maxSpeedInMin = maxSpeedInMin;
    }

    public void setBrakePathLenght(int brakePathLenght) {
        this.brakePathLenght = brakePathLenght;
    }

    public int getGears() {
        return gears;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxSpeedInMin() {
        return maxSpeedInMin;
    }

    public int getBrakePathLenght() {
        return brakePathLenght;
    }

    @Override
    public void getVihicleInfo() {
        System.out.println("SportCar.getVihicleInfo() - invoked");
        super.getVihicleInfo();
        System.out.println("Gears: " + getGears());
        System.out.println("Max Speed In Minute: " + getMaxSpeedInMin());

    }

}
