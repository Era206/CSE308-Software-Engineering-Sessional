package PROBLEM1.System;

import PROBLEM1.component.Display;
import PROBLEM1.component.Processors;

import java.util.ArrayList;

public class Queue extends QueuePlan{
    private Processors proc;
    private ArrayList<Display> displayList;

    public Queue(){
        //proc = new Processors();
        this.displayList = new ArrayList<Display>();
    }

    @Override
    public void processorSelect(Processors p) {
        this.proc=p;
    }

    @Override
    public void displayAddition(Display d) {
        this.displayList.add(d);
    }

    public double getTotalCost(){
        double cost=0;
        cost=cost + this.proc.getCost();
        int n=displayList.size();
        for(int i=0;i<n;i++){
            cost+= this.displayList.get(i).getCost();
        }
       return cost;
    }
    public void showElements(){
        this.proc.processorType();
        int n=this.displayList.size();
        this.displayList.get(0).displayType();
        System.out.println("You have ordered " + n + " displays");
    }

}
