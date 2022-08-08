package industry.kcirepunk.factory;

import industry.kcirepunk.impl.AbstractObjectPool;
import industry.kcirepunk.poolable.ExecutorTask;

public class ExecutorTaskFactory implements IPoolableObjectFactory<ExecutorTask> {

    public ExecutorTask createNew(){
        return new ExecutorTask();
    }
}
