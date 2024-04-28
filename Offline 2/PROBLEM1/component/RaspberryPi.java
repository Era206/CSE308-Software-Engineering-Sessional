package PROBLEM1.component;

public class RaspberryPi extends Processors{
    private double cost=400;

    public RaspberryPi() {
        this.setCost(cost);
    }

    @Override
    public void processorType() {
        System.out.println("It's in Raspberry Pi ");
    }
}
