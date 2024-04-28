package PROBLEM2;

public class Water extends Drinks{
    private double cost = 15;

    public Water() {
        this.setCost(cost);
    }

    @Override
    public void setAdditionType() {
        System.out.println("Water is added as drinks");
    }
}
