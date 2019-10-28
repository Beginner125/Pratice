package person.liming.test.test48.execution.Imp.executor.Imp;

import person.liming.test.test48.execution.ExecuteResult;
import person.liming.test.test48.execution.Executor;
import person.liming.test.test48.execution.Imp.context.BatContext;
import person.liming.test.test48.execution.Imp.context.Context;
import person.liming.test.test48.execution.Imp.executor.AbstractRobotExecutor;
import person.liming.test.test48.execution.Imp.result.StringExecuteResult;
import person.liming.test.test48.parse.Imp.CmdExecuteParser;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 20:502019/10/24
 */
public class BatExecutor extends AbstractRobotExecutor {
    @Override
    protected ExecuteResult specificExecute() {
        StringBuilder stringBuilder = new StringBuilder();
        BatContext batContext = (BatContext)context;
        Queue<Executor> executors = batContext.getExecutors();
        int i = 0;
        while (!executors.isEmpty()){
            stringBuilder.append(i++ +":"+executors.poll().execute().toString()+"\n");
        }
        return new StringExecuteResult(stringBuilder.toString());
    }

    @Override
    public Context parse(String param) {
        String[] commands = param.split(";");
        Queue<Executor> executors = new ConcurrentLinkedDeque<>();
        for(int i = 0; i < commands.length; i++){
            CmdExecuteParser parser = new CmdExecuteParser();
            executors.add(parser.parse(commands[i]));
        }
        return new BatContext(executors);
    }
}
