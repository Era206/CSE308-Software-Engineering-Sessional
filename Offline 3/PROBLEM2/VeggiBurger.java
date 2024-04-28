package PROBLEM2;

public class VeggiBurger implements MainCourse{
    private  double cost = 200;

    public VeggiBurger() {

    }

    public void prepareMeal() {
        System.out.println(("Veggi Burger is added as main course"));
    }


    public double mealPrice() {
        return cost;
    }
}
