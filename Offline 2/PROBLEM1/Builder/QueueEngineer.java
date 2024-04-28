package PROBLEM1.Builder;

public class QueueEngineer {
    private QueueBuilder queueBuilder;
    private int numOfDisplay;

    public QueueEngineer(QueueBuilder queueBuilder, int numOfDisplay) {
        this.queueBuilder = queueBuilder;
        this.numOfDisplay = numOfDisplay;
    }

    public void QueueSystemBuilder(){
        queueBuilder.setProcessorNew();
        for(int i=0;i<numOfDisplay;i++){
            queueBuilder.addDisplayNew();
        }

    }
    public QueueBuilder getQueueBuilder(){
        return this.queueBuilder;
    }
}
