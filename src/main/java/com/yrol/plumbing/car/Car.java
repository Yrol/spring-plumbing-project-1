package com.yrol.plumbing.car;

public class Car {

    private Doors doors;

    private Tyres tyres;

    private Engine engine;

    public Car() {

    }

    public Car(Doors doors, Tyres tyres, Engine engine) {
        this.doors = doors;
        this.tyres = tyres;
        this.engine = engine;
    }

    public Doors getDoors() {
        return doors;
    }

    public void setDoors(Doors doors) {
        this.doors = doors;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
