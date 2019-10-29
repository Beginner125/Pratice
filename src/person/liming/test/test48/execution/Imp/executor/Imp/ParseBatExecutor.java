package person.liming.test.test48.execution.Imp.executor.Imp;

import person.liming.test.test48.execution.ExecuteResult;
import person.liming.test.test48.execution.Executor;
import person.liming.test.test48.execution.Imp.context.BatContext;
import person.liming.test.test48.execution.Imp.context.Context;
import person.liming.test.test48.execution.Imp.context.StringContext;
import person.liming.test.test48.execution.Imp.executor.AbstractRobotExecutor;
import person.liming.test.test48.execution.Imp.result.StringExecuteResult;
import person.liming.test.test48.parse.Imp.CmdExecuteParser;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 15:142019/10/28
 */
public class ParseBatExecutor extends AbstractRobotExecutor {
    @Override
    protected ExecuteResult specificExecute() {
        StringContext stringContext = (StringContext)context;
        StringBuilder stringBuilder = new StringBuilder();

        String[] commands = stringContext.getStrings();
        for(int i = 0; i < commands.length; i++){
            CmdExecuteParser parser = new CmdExecuteParser();
            stringBuilder.append(i +":"+parser.parse(commands[i]).execute().toString()+"\n");
        }
        return new StringExecuteResult(stringBuilder.toString());
    }

    @Override
    public Context parse(String param) {
        String[] commands = param.split(";");
        return new StringContext(commands);
    }
}
