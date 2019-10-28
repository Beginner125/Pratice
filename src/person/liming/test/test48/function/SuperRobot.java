package person.liming.test.test48.function;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 15:272019/10/23
 */
public class SuperRobot extends Robot {
    Point pos;

    public SuperRobot() throws AWTException {
        pos = MouseInfo.getPointerInfo().getLocation();
    }

    public void moveRight(){
        setPos(++pos.x, pos.y);
    }
    public void moveLeft(){
        setPos(--pos.x, pos.y);
    }
    public void moveTop(){
        setPos(pos.x, --pos.y);
    }
    public void moveDown(){
        setPos(pos.x, ++pos.y);
    }
    public void singleClick(){
        this.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
        this.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
    }
    public void doubleClick(){
        this.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
        this.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
        this.delay(100);
        this.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
        this.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
    }
    public void linerMoveMouse(int x1, int y1, int delay) {
        int x0 = pos.x;
        int y0 = pos.y;
        int dir = x1 > x0 ? 1 : -1;
        for (int i = 0; i < Math.abs(x1 - x0); i++) {
            pos.x += dir;
            pos.y = ((pos.x - x0) * (y1 - y0)) / (x1 - x0) + y0;
            setPos(pos.x, pos.y);
            delay(delay);
        }
    }
    public void singleKeyClick(int keycode){
        keyPress(keycode);
        keyRelease(keycode);
    }
    /**
     * @param x 设置鼠标的位置
     */
    public void setPos(int x, int y){
        pos.x = x;
        pos.y = y;
        mouseMove(x, y);
    }
    public BufferedImage captureAllScreen(){
        int width = 1366;
        int height = 760;
        return createScreenCapture(new Rectangle(width, height));
    }
}
