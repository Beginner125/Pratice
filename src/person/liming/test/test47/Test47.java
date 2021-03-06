package person.liming.test.test47;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author liuliming
 * @Description 使用代码将本project下所有Test类的类名和Describe保存到README（便于github上查看）和Test47下的package-info（便于javadoc查看）中
 * @Date: Created in 12:112019/10/22
 */
public class Test47 {
    /**
     * @param word 首字母没大写的单词
     * @return 首字母大写后的单词
     */
    public static String toFirstUpperCase(String word){
        char a = word.charAt(0);
        word = word.replaceFirst("\\w", String.valueOf(a).toUpperCase());
        return word;
    }

    public static void main(String[] args) {
        File file = new File("src/person/liming/test");
        File[] sub1 = file.listFiles();
        //创建储存文件的输入输出流
        File resultFile = new File("README.md");
        RandomAccessFile resultAccessFile = null;
        try {
            resultAccessFile = new RandomAccessFile(resultFile, "rw");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int maxNum = 1;
        for(File f:sub1){
            String name = f.getName();
            int num = Integer.valueOf(name.substring(4, name.length()));
            if(maxNum < num){
                maxNum = num;
            }
        }
        try {
            for (int i = 1; i < maxNum; i++) {
                File testFile = new File(file.getAbsolutePath()+"/test"+String.valueOf(i)+"/"+toFirstUpperCase("test"+String.valueOf(i)+".java"));
                if(!testFile.exists()){
                    System.out.println("不存在文件："+testFile.exists());
                    continue;
                }
                RandomAccessFile randomAccessFile = null;
                    randomAccessFile = new RandomAccessFile(testFile, "r");
                    StringBuilder stringBuilder = new StringBuilder();
                    String line;
                    while((line = randomAccessFile.readLine()) != null){
                        Pattern pattern = Pattern.compile("@Description.*");
                        Matcher matcher = pattern.matcher(line);
                        if (matcher.find()){
                            String temp = matcher.group();
                            stringBuilder.append(temp.substring(12, temp.length()));
                        }
                    }
                    resultAccessFile.writeBytes(testFile.getName().split("\\.")[0]+" : "+stringBuilder.toString()+"\r\n"+"\r\n");
            }
            resultAccessFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

/*        //无序遍历所有test包
        for(File f:sub1){
            File testFile = new File(f.getPath()+"/"+toFirstUpperCase(f.getName()+".java"));
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(testFile, "r");
                StringBuilder stringBuilder = new StringBuilder();
                String line;
                while((line = randomAccessFile.readLine()) != null){
                    Pattern pattern = Pattern.compile("@Description.*");
                    Matcher matcher = pattern.matcher(line);
                    if (matcher.find()){
//                        System.out.println(matcher.group());
                        stringBuilder.append(matcher.group());
//                        stringBuilder.append(new String(matcher.group().getBytes("ISO-8859-1"), "utf-8"));
                    }
                }
                resultAccessFile.writeBytes(f.getName()+" : "+stringBuilder.toString()+"\r\n"+"\r\n");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

    }
}
