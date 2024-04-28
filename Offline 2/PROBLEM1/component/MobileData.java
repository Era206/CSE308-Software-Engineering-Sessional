package PROBLEM1.component;

public class MobileData extends Communication{
    private double cost = 200;
    public MobileData(){
        this.setCost(cost);
    }


    @Override
    public void communicationType() {
        System.out.println("It's in Mobile data communication");
    }
}
