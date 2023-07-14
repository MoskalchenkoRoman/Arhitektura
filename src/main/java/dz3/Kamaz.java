package dz3;

import java.awt.*;

public class Kamaz extends Car implements GasStation{
    public Kamaz(String stamp, String model, Color color, String body, int wheels, String fuel, String transmission, float engineVolume) {
        super(stamp, model, color, body, wheels, fuel, transmission, engineVolume);
    }


    @Override
    public void refueling(String fuel) {
        if (fuel.equals("Дизель")){
            System.out.println("в бак поступает саляра");
        }else
            System.out.println("в бак поступает бензин");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Тип двигателя - ").append(getFuel());
        return builder.toString();
    }
}
