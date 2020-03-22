package person.liming.test.test53;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 18:342019/12/3
 */
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ZPlane extends JPanel {

    private static final long serialVersionUID = 1L;
    private Image image;
    private int imgWidth;
    private int imgHeight;

    public int getImgWidth() {
        return imgWidth;
    }

    public void setImgWidth(int imgWidth) {
        this.imgWidth = imgWidth;
    }

    public int getImgHeight() {
        return imgHeight;
    }

    public void setImgHeight(int imgHeight) {
        this.imgHeight = imgHeight;
    }

    public void setImage(Image image) {
        // 该方法不推荐使用，该方法是懒加载，图像并不加载到内存，当拿图像的宽和高时会返回-1；
        // image = Toolkit.getDefaultToolkit().getImage(imgPath);
        this.image = image;
        setImgWidth(image.getWidth(this));
        setImgHeight(image.getHeight(this));
    }

    @Override
    public void paintComponent(Graphics g1) {
        int x = 0;
        int y = 0;
        Graphics g = (Graphics) g1;
        if (null == image) {
            return;
        }
        g.setColor(new Color(255, 255, 255));
        g.fillRect(0, 0, getWidth(), getHeight());
        g.drawImage(image, x, y, image.getWidth(this), image.getHeight(this),
                this);
        g = null;
    }
}