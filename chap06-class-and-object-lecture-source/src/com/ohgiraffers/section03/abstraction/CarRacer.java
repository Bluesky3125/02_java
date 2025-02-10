package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    private Car myCar = new Car();


    public void startup() {
        this.myCar.startUp();
    }

    public void stepAccelerator() {
        this.myCar.go();
    }

    public void stepBrake() {
        this.myCar.stop();
    }

    public void turnOff() {
        this.myCar.turnOff();
    }
}
