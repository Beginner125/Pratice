package person.liming.test.test48.parse;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 15:172019/10/23
 */
public interface Parser<P, R> {
    public R parse(P param);
}
