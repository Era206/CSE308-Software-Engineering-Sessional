package PROBLEM1.Builder;

import PROBLEM1.System.Queue;

public abstract class QueueBuilder {
    public abstract void setProcessorNew();
    public abstract void addDisplayNew();
    public abstract Queue getQueue();
}
