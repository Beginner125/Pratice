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

    String info = "没有此命令,你可以使用help来查看所有命令";

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
