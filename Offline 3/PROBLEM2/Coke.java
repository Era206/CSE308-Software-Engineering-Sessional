package PROBLEM2;

public class Coke extends Drinks{
    private double cost = 25;

    public Coke() {
        this.setCost(cost);
    }

    @Override
    public void setAdditionType() {
        System.out.println("Coke is added as drinks");
    }
}
