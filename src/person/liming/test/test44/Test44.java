package person.liming.test.test44;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

/**
 * @author liuliming
 * @Description 获取剪切板中的内容
 * @Date: Created in 13:072019/10/19
 */
public class Test44 {
    // 获取剪切板中的内容
    public static String getClipboardText()
    {
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable clipT = clip.getContents(null);
        if (clipT != null)
        {
            // 检查内容是否是文本类型
            if (clipT.isDataFlavorSupported(DataFlavor.stringFlavor))
            {
                try
                {
                    String text = (String) clipT
                            .getTransferData(DataFlavor.stringFlavor);
                    return text;
                }
                catch (UnsupportedFlavorException e)
                {
                    e.printStackTrace();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getClipboardText());
    }
}
