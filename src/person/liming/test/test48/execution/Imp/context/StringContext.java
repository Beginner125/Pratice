package person.liming.test.test48.execution.Imp.context;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 19:482019/10/23
 */
public class StringContext extends Context {
    String string;

    public StringContext(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
