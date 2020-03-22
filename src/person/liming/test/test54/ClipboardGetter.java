package person.liming.test.test54;

import person.liming.test.test53.Frame;

import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 14:562020/1/31
 */
public class ClipboardGetter {
    Clipboard clipboard;
    RandomAccessFile randomAccessFile;
    String beforeString;
    String nowString;
    Timer timer;

    /**
     * 将会打开一个线程，该线程监听剪切板，发现新的文字执行findNewTextEvent
     */
    ClipboardGetter(RandomAccessFile randomAccessFile){
        this.randomAccessFile = randomAccessFile;
        clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        beforeString = getText();
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(isNewText()){
                    findNewTextEvent();
                }
            }
        }, 0, 1000);
    }

    public String getText(){
        Transferable clipT = clipboard.getContents(null);
        if (clipT != null)
        {
            // 检查内容是否是文本类型
            if (clipT.isDataFlavorSupported(DataFlavor.stringFlavor))
            {
                try
                {
                    String text = (String) clipT
                            .getTransferData(DataFlavor.stringFlavor);

                    return text.replaceAll(" ", "");
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

    public boolean isNewText(){
        if(beforeString != null && (beforeString.equals(nowString = getText())) || nowString == null){
            return false;
        }
        beforeString = nowString;
        return true;
    }

    public void findNewTextEvent(){
        System.out.println("准备保存");
        int result = JOptionPane.showConfirmDialog(null, "是否保存到生词本？", "保存",JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.OK_OPTION){
            System.out.println(nowString);
            try {
                randomAccessFile.writeChars("\n"+nowString);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
