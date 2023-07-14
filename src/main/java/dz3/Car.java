package dz3;

import java.awt.*;

public abstract class Car {
    private String stamp;
    private String model;
    private Color color;
    private String body;
    private int wheels;
    private String fuel;
    private String transmission;
    private float engineVolume;

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public Car(String stamp, String model, Color color, String body, int wheels, String fuel, String transmission, float engineVolume) {
        this.stamp = stamp;
        this.model = model;
        this.color = color;
        this.body = body;
        this.wheels = wheels;
        this.fuel = fuel;
        this.transmission = transmission;
        this.engineVolume = engineVolume;
    }

    public void movement() {}
    public void service() {}
    public void gearShifting() {}
    public void turningOnTheHeadlights() {}
    public void turningOnTheWipers() {}
}
