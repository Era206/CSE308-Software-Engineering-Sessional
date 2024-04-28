package PROBLEM1.component;

public class ATMega32 extends Processors{
    private double cost=200;

    public ATMega32() {
        this.setCost(cost);
    }

    @Override
    public void processorType() {
        System.out.println("It's in ATMega32");
    }
}
