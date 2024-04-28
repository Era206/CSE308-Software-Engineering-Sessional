package PROBLEM1;

import PROBLEM1.Builder.QueueEngineer;
import PROBLEM1.component.Communication;

import java.util.Scanner;

public class problem1main {
    public static void main(String[] args) {
        SystemFactory system = new SystemFactory();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Queue Management System(Deluxe/Optimal/Poor): ");
        String name = sc.nextLine();
        System.out.println("Enter number of display:");
        int total = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Communication System(Wifi/Mobile Data): ");
        String comType = sc.nextLine();

        QueueEngineer director = new QueueEngineer(system.queueType(name),total);
        director.QueueSystemBuilder();
        Communication type = system.com(comType);

        double totalCost = director.getQueueBuilder().getQueue().getTotalCost()+type.getCost();

        System.out.println("total Cost regarding system: "+ totalCost);
        System.out.println("Details about the system: ");
        director.getQueueBuilder().getQueue().showElements();
        type.communicationType();

    }
}
