package person.liming.test.test48.execution.Imp.auxiliary;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * @author liuliming
 * @Description 该接口是能够在图片中识别另一个图片的位置，然后定位坐标
 * @Date: Created in 8:572019/10/27
 */
public interface ImageLocate {
    /**
     * @return 与图像最相似的定位点
     */
    public Point locate();
}
