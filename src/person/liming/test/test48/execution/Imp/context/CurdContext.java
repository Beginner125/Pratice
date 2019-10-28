package person.liming.test.test48.execution.Imp.context;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 15:052019/10/26
 */
public class CurdContext extends Context {
    public enum CURD{add,del,find,mod,use,list};
    CURD curd;
    String name;
    String content;

    public CurdContext(CURD curd, String name, String content) {
        this.curd = curd;
        this.name = name;
        this.content = content;
    }

    public CURD getCurd() {
        return curd;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

}
