package PROBLEM1.component;

public class LED extends Display{
    private double cost = 3000;
    public LED(){
        this.setCost(cost);
    }


    @Override
    public void displayType() {
        System.out.println("It's in LED Display");
    }
}
