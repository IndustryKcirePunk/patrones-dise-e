package industry.kcirepunk.impl;

import industry.kcirepunk.poolable.IPooledObject;

public interface IObjectPool<T extends IPooledObject> {
    public T getObject() throws PoolException;
    public void releaceObject(T pooledObject);
}
