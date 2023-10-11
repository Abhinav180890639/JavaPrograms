package com.abhinav;

public class MotorBike {
    private int speed;

    void setSpeed(int speed){
        if (speed > 0)
            this.speed = speed;

    }

    public int getSpeed() {
        return this.speed;
    }

    void start(){
        System.out.println("Bike Start");
    }

    public void increaseSpeed(int howMuch){
        this.speed = this.speed + howMuch;
    }

    public void decreaseSpeed(int howMuch){
        this.speed = this.speed - howMuch;
    }

    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.start();
        honda.start();

        ducati.setSpeed(100);
        ducati.increaseSpeed(100);
        honda.increaseSpeed(100);

        ducati.decreaseSpeed(250);
        honda.decreaseSpeed(150);

        int ducatiSpeed = ducati.getSpeed();
        ducatiSpeed += 100;
        ducati.setSpeed(ducatiSpeed);

        int hondaSpeed = honda.getSpeed();
        hondaSpeed += 100;
        honda.setSpeed(hondaSpeed);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
    }
}
