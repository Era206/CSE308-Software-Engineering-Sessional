package PROBLEM1.component;

public class ArduinoMega extends Processors{
    private double cost=300;

    public ArduinoMega() {
        this.setCost(cost);
    }

    @Override
    public void processorType() {
        System.out.println("It's in Arduino Mega");
    }
}
