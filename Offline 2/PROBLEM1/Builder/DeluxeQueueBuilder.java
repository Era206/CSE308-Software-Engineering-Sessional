package PROBLEM1.Builder;
import PROBLEM1.System.Queue;
import PROBLEM1.component.Display;
import PROBLEM1.component.LCD;
import PROBLEM1.component.Processors;
import PROBLEM1.component.RaspberryPi;

public class DeluxeQueueBuilder extends QueueBuilder{
    private Queue queue=new Queue();

    public DeluxeQueueBuilder(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void setProcessorNew() {
        Processors p = new RaspberryPi();
        queue.processorSelect(p);
    }

    @Override
    public void addDisplayNew() {
        Display d = new LCD();
        queue.displayAddition(d);
    }

    @Override
    public Queue getQueue() {
        return this.queue;
    }
}
