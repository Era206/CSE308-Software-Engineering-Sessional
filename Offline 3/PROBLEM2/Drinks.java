package PROBLEM2;

public abstract class Drinks extends Addition {

    private String types = "Drinks";


    //public abstract void DrinksType();

    @Override
    public void setAdditionType() {
        System.out.println("Additional item  is a " + types);
    }
}
