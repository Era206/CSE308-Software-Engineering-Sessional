package PROBLEM1.component;

public class LCD extends Display{
    private double cost = 2000;
    public LCD(){
        this.setCost(cost);
    }


    @Override
    public void displayType() {
        System.out.println("It's in LCD Display");
    }
}
