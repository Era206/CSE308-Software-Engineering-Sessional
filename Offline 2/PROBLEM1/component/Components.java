package PROBLEM1.component;


public abstract class Components {
    private double cost;
    //private String type;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }



    public abstract void setType() ;
}
