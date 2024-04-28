package PROBLEM1.Builder;
import PROBLEM1.System.Queue;
import PROBLEM1.component.ATMega32;
import PROBLEM1.component.Display;
import PROBLEM1.component.LED;
import PROBLEM1.component.Processors;

public class PoorQueueBuilder extends QueueBuilder{
    Queue queue=new Queue();

    public PoorQueueBuilder(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void setProcessorNew() {
        Processors p = new ATMega32();
        queue.processorSelect(p);
    }

    @Override
    public void addDisplayNew() {
        Display d = new LED();
        queue.displayAddition(d);
    }

    @Override
    public Queue getQueue(){
        return this.queue;
    }
}
