package person.liming.test.test48.utils;

import java.awt.*;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 9:522019/10/27
 */
public class PointValue<T> extends Point {
    public T value;

    public PointValue(T value) {
        this.value = value;
    }

    public PointValue(Point p, T value) {
        super(p);
        this.value = value;
    }

    public PointValue(int x, int y, T value) {
        super(x, y);
        this.value = value;
    }

    public boolean isInclude(Rectangle rectangle){
        if(x >= rectangle.x && x <= rectangle.x+rectangle.width
        &&y >= rectangle.y && y <= rectangle.y+rectangle.height){
            return true;
        }
        return false;
    }
}
