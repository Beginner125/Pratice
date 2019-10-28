package person.liming.test.test48.execution.Imp.result;

import person.liming.test.test48.execution.ExecuteResult;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 16:192019/10/23
 */
public class StringExecuteResult extends ExecuteResult {
    String info;

    public StringExecuteResult(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return info;
    }
}
