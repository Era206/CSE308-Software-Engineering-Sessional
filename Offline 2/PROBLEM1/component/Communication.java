package PROBLEM1.component;

public abstract class Communication extends Components{
    private String types = "Communication";

    public void setType() {
        System.out.println("This is in a " + types);
    }

    public abstract void communicationType();
}
