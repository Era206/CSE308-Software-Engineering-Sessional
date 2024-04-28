package PROBLEM2;

public class FrenchFries extends Appetizers{
    private double cost = 80;

    public FrenchFries() {
        this.setCost(cost);
    }


    @Override
    public void setAdditionType(){
        System.out.println("French Fries is added as appetizers");
    }
}
