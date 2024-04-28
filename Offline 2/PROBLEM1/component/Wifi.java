package PROBLEM1.component;

public class Wifi extends Communication{
    private double cost = 500;
    public Wifi(){
        this.setCost(cost);
    }


    @Override
    public void communicationType() {
        System.out.println("It's in Wifi communication");
    }
}
