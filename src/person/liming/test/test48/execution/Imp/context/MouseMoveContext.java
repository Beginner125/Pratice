package person.liming.test.test48.execution.Imp.context;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 19:292019/10/23
 */
public class MouseMoveContext extends Context {

    int x;
    int y;

    public MouseMoveContext(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
