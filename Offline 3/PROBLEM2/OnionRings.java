package PROBLEM2;

public class OnionRings extends Appetizers{
    private double cost = 60;

    public OnionRings() {
        this.setCost(cost);
    }


    @Override
    public void setAdditionType() {
        System.out.println("Onion Rings is added as appetizers");
    }
}
