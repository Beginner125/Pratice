package person.liming.test.test48.execution.Imp.auxiliary.Imp;

import sun.awt.image.ImageFormatException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 9:402019/10/28
 */
public class ImageLocatorFactory {
    public static HistogramImagelocator getHistogramImageLocator(BufferedImage sourceImg, String imgPath) throws NoSuchFileException, ImageFormatException {
        File file = new File(imgPath);
        if(!file.exists()){
            throw new NoSuchFileException(imgPath);
        }
        String[] temp = imgPath.split("\\.");
        String suffix = temp[temp.length-1];
        if(!suffix.equals("jpg") && !suffix.equals("png") && !suffix.equals("bmp") && !suffix.equals("gif")){
            throw new ImageFormatException(imgPath);
        }
        BufferedImage image = null;
        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        HistogramImagelocator histogramImagelocator = new HistogramImagelocator(sourceImg, image);
        return histogramImagelocator;
    }
}
