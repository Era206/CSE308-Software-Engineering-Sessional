package PROBLEM2;

public class Coffee extends Drinks{
    private double cost = 60;

    public Coffee() {
        this.setCost(cost);
    }

    @Override
    public void setAdditionType() {
        System.out.println("Coffee is added as drinks");
    }
}
