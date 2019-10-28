package person.liming.test.test48.execution.Imp.executor;

import person.liming.test.test48.execution.ExecuteResult;
import person.liming.test.test48.execution.Imp.context.Context;
import person.liming.test.test48.execution.Imp.context.CurdContext;
import person.liming.test.test48.execution.Imp.result.StringExecuteResult;
import person.liming.test.test48.parse.Imp.CmdExecuteParser;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 14:202019/10/27
 */
public abstract class AbstractCurdExecutor extends AbstractRobotExecutor {
    protected CurdContext curdContext;
    @Override
    protected ExecuteResult specificExecute() {
        curdContext = (CurdContext)context;
        switch (curdContext.getCurd()){
            case add:
                return add();
            case mod:
                return mod();
            case del:
                return del();
            case find:
                return find();
            case use:
                return use();
            case list:
                return list();
        }
        return null;
    }

    public abstract ExecuteResult add();
    public abstract ExecuteResult mod();
    public abstract ExecuteResult del();
    public abstract ExecuteResult find();
    public abstract ExecuteResult use();
    public abstract ExecuteResult list();
}
