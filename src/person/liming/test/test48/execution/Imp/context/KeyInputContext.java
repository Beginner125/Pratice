package person.liming.test.test48.execution.Imp.context;

import java.util.Queue;
import java.util.Stack;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 19:362019/10/23
 */
public class KeyInputContext extends Context {

    Queue<Integer> keyCode;

    public KeyInputContext(Queue<Integer> keyCode) {
        this.keyCode = keyCode;
    }


    public Queue<Integer> getKeyCode() {
        return keyCode;
    }
}
