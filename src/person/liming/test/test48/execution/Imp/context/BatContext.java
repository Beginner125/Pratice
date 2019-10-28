package person.liming.test.test48.execution.Imp.context;

import person.liming.test.test48.execution.Executor;

import java.util.Queue;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 20:532019/10/24
 */
public class BatContext extends Context {
    Queue<Executor> executors;

    public BatContext(Queue<Executor> executors) {
        this.executors = executors;
    }

    public Queue<Executor> getExecutors() {
        return executors;
    }
}
