package PROBLEM2;

public abstract class Appetizers extends Addition{
    private String types = "Appetizers";


    //public abstract void AppetizersType();
    @Override
    public void setAdditionType() {
        System.out.println("Additional item  is a " + types);
    }
}
