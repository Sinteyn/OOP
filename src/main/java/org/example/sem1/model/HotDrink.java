package org.example.sem1.model;

public class HotDrink extends BottleOfWater {
    private int temperature;

    public HotDrink(String name, double cost, int volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
    }


    @Override
    public String toString() {
        return "HotDrink {" +
                "name = '" + super.getName() + "', " +
                "volume = '" + super.getVolume() + "', " +
                "temperature = '" + this.temperature + "', " +
                "cost = " + super.getCost() +
                '}';
    }
}
