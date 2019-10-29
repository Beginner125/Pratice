package person.liming.test.test48.execution.Imp.context;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 19:482019/10/23
 */
public class StringContext extends Context {
    String string;
    String[] strings;

    public StringContext(String string) {
        this.string = string;
    }

    public StringContext(String[] strings) {
        this.strings = strings;
    }

    public String getString() {
        return string;
    }

    public String[] getStrings() {
        return strings;
    }
}
