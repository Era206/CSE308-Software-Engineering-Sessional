package PROBLEM2;

public abstract class Addition {
    private double cost;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public abstract void setAdditionType();
}
