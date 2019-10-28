package person.liming.test.test48.parse.Imp;

import person.liming.test.test48.execution.Executor;
import person.liming.test.test48.execution.Imp.executor.Imp.InvalidCmdExecutor;
import person.liming.test.test48.execution.Imp.context.GlobalContext;
import person.liming.test.test48.execution.Imp.executor.AbstractRobotExecutor;
import person.liming.test.test48.parse.Parser;

import java.util.Map;
import java.util.Set;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 16:082019/10/23
 */
public class CmdExecuteParser implements Parser<String, Executor> {

    @Override
    public Executor parse(String parseParam) {
        parseParam = parseParam.toLowerCase();
        Map<String, Executor> parseRule = GlobalContext.parseRule;
        Set<String> set = parseRule.keySet();
        AbstractRobotExecutor executor = null;
        for (String regular :
                set) {
            if(parseParam.matches(regular)){
                try {
                    executor = (AbstractRobotExecutor) parseRule.get(regular).getClass().newInstance();
                    executor.setContext(executor.parse(parseParam));
                    break;
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        if(executor == null){
            return new InvalidCmdExecutor();
        }
        return executor;
    }
}
