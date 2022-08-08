package industry.kcirepunk.factory;

import industry.kcirepunk.poolable.IPooledObject;

public interface IPoolableObjectFactory<T extends IPooledObject> {
    public T createNew();
}
