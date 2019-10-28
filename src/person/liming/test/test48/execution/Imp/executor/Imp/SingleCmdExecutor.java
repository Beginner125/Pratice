package person.liming.test.test48.execution.Imp.executor.Imp;

import person.liming.test.test48.execution.ExecuteResult;
import person.liming.test.test48.execution.Imp.context.GlobalContext;
import person.liming.test.test48.execution.Imp.executor.AbstractRobotExecutor;
import person.liming.test.test48.execution.Imp.result.StringExecuteResult;
import person.liming.test.test48.execution.Imp.context.StringContext;

import java.util.Queue;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 19:482019/10/23
 */
public class SingleCmdExecutor extends AbstractRobotExecutor {

    @Override
    protected ExecuteResult specificExecute() {
        StringContext stringContext = (StringContext)context;
        String string = stringContext.getString();
        switch (string){
            case "sclick":
                superRobot.singleClick();
                break;
            case "dclick":
                superRobot.doubleClick();
                break;
            case "exit":
                System.exit(0);
                break;
            case "history":
                Queue<String> queue = GlobalContext.cmdHistory;
                StringBuilder stringBuilder = new StringBuilder();
                int i = 0;
                for (String s :
                        queue) {
                    stringBuilder.append(i).append(": ").append(s).append("\n");
                    i++;
                }
                return new StringExecuteResult(stringBuilder.toString());
        }
        return new StringExecuteResult("÷¥––"+string+"√¸¡Ó≥…π¶");
    }

    @Override
    public StringContext parse(String param) {
        return new StringContext(param.trim());
    }
}
