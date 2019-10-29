package person.liming.test.test48.execution.Imp.executor.Imp;

import person.liming.test.test48.execution.ExecuteResult;
import person.liming.test.test48.execution.Imp.context.Context;
import person.liming.test.test48.execution.Imp.context.NumContext;
import person.liming.test.test48.execution.Imp.executor.AbstractRobotExecutor;
import person.liming.test.test48.execution.Imp.result.StringExecuteResult;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 10:442019/10/28
 */
public class SleepExecutor extends AbstractRobotExecutor {
    @Override
    protected ExecuteResult specificExecute() {
        NumContext numContext = (NumContext)context;
        try {
            Thread.sleep(numContext.getI());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new StringExecuteResult("Õ£÷π"+numContext.getI()+"√Î");
    }

    @Override
    public Context parse(String param) {
        int time = Integer.valueOf(param.split(" +")[1]);

        return new NumContext(time);
    }
}
