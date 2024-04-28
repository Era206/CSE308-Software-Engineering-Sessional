package PROBLEM2;

public class BeefBurger implements MainCourse{
    private  double cost = 260;
    public BeefBurger() {

    }



    public void prepareMeal() {

        System.out.println("Beef Burger is added as main course");
    }


    public double mealPrice() {
        return cost;
    }
}
