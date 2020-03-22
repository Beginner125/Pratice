package person.liming.test.test54;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * @author liuliming
 * @Description 写一个保存生词的程序，将复制的单词自动保存到txt文件当中。
 * @Date: Created in 14:412020/1/31
 */
public class Test54 {

    public static void main(String[] args) {
        String path = args[0];
        System.out.println("保存路劲："+path);
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile(path, "rwd");
            randomAccessFile.seek(randomAccessFile.length());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ClipboardGetter getter = new ClipboardGetter(randomAccessFile);
        getter.findNewTextEvent();
        while (true);
    }
}
