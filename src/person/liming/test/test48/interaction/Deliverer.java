package person.liming.test.test48.interaction;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 15:212019/10/23
 */
public interface Deliverer<T> {
    public void deliver(T message);
}
