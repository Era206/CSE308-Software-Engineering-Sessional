package PROBLEM1.component;

public abstract class Processors extends Components {
    private String types = "Processor";

    public Processors() {
    }

    public void setType() {
        System.out.println("This is in a " + types);
    }

    public abstract void processorType();
}
