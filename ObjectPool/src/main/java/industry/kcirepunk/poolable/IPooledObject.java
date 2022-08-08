package industry.kcirepunk.poolable;

public interface IPooledObject {
    public boolean validate();
    public void invalidate();
}
