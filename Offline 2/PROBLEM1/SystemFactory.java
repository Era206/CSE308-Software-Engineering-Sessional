package PROBLEM1;

import PROBLEM1.Builder.DeluxeQueueBuilder;
import PROBLEM1.Builder.OptimalQueueBuilder;
import PROBLEM1.Builder.PoorQueueBuilder;
import PROBLEM1.Builder.QueueBuilder;
import PROBLEM1.System.Queue;
import PROBLEM1.component.Communication;
import PROBLEM1.component.MobileData;
import PROBLEM1.component.Wifi;

public class SystemFactory {
    public SystemFactory() {
    }

    public QueueBuilder queueType(String str){
        //QueueBuilder builder = null;
        Queue q = new Queue();
        if (str.equalsIgnoreCase("deluxe")){
            return new DeluxeQueueBuilder(q);
        }
        else if(str.equalsIgnoreCase("optimal")){
            return new OptimalQueueBuilder(q);
        }
        else if(str.equalsIgnoreCase("poor")){
            return new PoorQueueBuilder(q);
        }
        return null;
    }

    public Communication com(String str){
        if(str.equalsIgnoreCase("wifi")){
            return new Wifi();
        }
        else if(str.equalsIgnoreCase("mobile data")){
            return new MobileData();
        }
        else return null;
    }
}
