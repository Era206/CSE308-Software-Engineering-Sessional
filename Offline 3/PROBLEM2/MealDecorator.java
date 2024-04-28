package PROBLEM2;

public abstract class MealDecorator implements MainCourse{
    private MainCourse meal;

    public MealDecorator(MainCourse meal){
        this.meal=meal;

    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();

    }

    @Override
    public double mealPrice() {
        return meal.mealPrice();
    }


}
