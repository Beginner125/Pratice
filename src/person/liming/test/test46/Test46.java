package person.liming.test.test46;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * @author liuliming
 * @Description 使用java控制鼠标移动到谷歌浏览器bing的输入框中，输入查询的内容并回车，然后截图保存。
 * @Date: Created in 10:462019/10/22
 */
public class Test46 {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        Random random = new Random();
        int a = 0;
        robot.delay(3000);

        int x = 0;
        int y = 0;
        while(x < 177){
            robot.mouseMove(x++, y++);
            robot.delay(16);
        }
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.keyPress(17);
        robot.keyPress(KeyEvent.VK_A);

        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(17);

        robot.keyPress(KeyEvent.VK_DELETE);
        robot.keyRelease(KeyEvent.VK_DELETE);

        robot.keyPress(KeyEvent.VK_H);
        robot.keyRelease(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        robot.keyPress(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_W);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        BufferedImage image = robot.createScreenCapture(new Rectangle(1366, 768));
        File file = new File("F:/helloworld.jpg");
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            ImageIO.write(image, "jpg", file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
