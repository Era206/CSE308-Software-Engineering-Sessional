package PROBLEM1.component;

public abstract class Display extends Components{

    private String types = "Display";

    public void setType() {
        System.out.println("This is in a " + types);
    }
    public abstract void displayType();
}
