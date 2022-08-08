package industry.kcirepunk.impl;

import industry.kcirepunk.factory.IPoolableObjectFactory;
import industry.kcirepunk.poolable.ExecutorTask;

public class ExecutorThreadPool extends AbstractObjectPool<ExecutorTask>{

    public ExecutorThreadPool(int minInstances, int maxInstances, int waitTime,
                              IPoolableObjectFactory<ExecutorTask> poolableObjectFactory) {
        super(minInstances, maxInstances, waitTime, poolableObjectFactory);
    }
}