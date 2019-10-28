package person.liming.test.test48.execution.Imp.executor.Imp;

import person.liming.test.test48.execution.ExecuteResult;
import person.liming.test.test48.execution.Executor;
import person.liming.test.test48.execution.Imp.result.StringExecuteResult;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 16:212019/10/23
 */
public class InvalidCmdExecutor implements Executor {

    String info = "√ª”–¥À√¸¡Ó";

    public InvalidCmdExecutor() {
    }

    public InvalidCmdExecutor(String info) {
        this.info = info;
    }

    @Override
    public ExecuteResult execute() {
        ExecuteResult result = new StringExecuteResult(info);
        return result;
    }
}
