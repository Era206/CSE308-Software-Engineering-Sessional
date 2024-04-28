package PROBLEM2;

public class Cheese extends Addition{
    private String types = "Cheese";

    private double cost = 100;

    public Cheese() {
        this.setCost(cost);
    }


    @Override
    public void setAdditionType() {
        System.out.println("Additional item  is a " + types);
    }
}
