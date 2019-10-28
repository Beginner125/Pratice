package person.liming.test.test48.execution.Imp.executor;

import person.liming.test.test48.execution.ExecuteResult;
import person.liming.test.test48.execution.Executor;
import person.liming.test.test48.execution.Imp.context.Context;
import person.liming.test.test48.execution.Imp.context.GlobalContext;
import person.liming.test.test48.function.SuperRobot;
import person.liming.test.test48.parse.Parser;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 19:222019/10/23
 */
public abstract class AbstractRobotExecutor implements Executor, Parser<String, Context> {
    protected SuperRobot superRobot = GlobalContext.superRobot;
    protected Context context;

    @Override
    public ExecuteResult execute() {
        if(context == null){
            throw new RuntimeException("该执行器没有上下文");
        }
        return specificExecute();
    }

    protected abstract ExecuteResult specificExecute();

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
