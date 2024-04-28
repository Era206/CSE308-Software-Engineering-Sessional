package PROBLEM2;

import java.util.ArrayList;

public class MealCombo4 extends MealDecorator{
    ArrayList<Addition> additions = new ArrayList<Addition>();

    public MealCombo4(MainCourse meal) {
        super(meal);
        additions.add(new OnionRings());
        additions.add(new Coffee());
        additions.add(new Water());
    }

    public void prepareMeal() {
        super.prepareMeal();
        for(int i=0;i <additions.size(); i++){
            additions.get(i).setAdditionType();
        }

    }

    public double mealPrice() {
        Double price = super.mealPrice();
        for(int i=0;i <additions.size(); i++){
            price += additions.get(i).getCost();
        }
        return price;
    }
}
