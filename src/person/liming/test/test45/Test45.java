package person.liming.test.test45;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author liuliming
 * @Description 爬取煎蛋网上的树洞信息并存在数据库中
 * @Date: Created in 19:182019/10/21
 */
public class Test45 {
    public static StringBuilder getLine(InputStream inputStream) throws IOException {
        char c;
        StringBuilder stringBuilder = new StringBuilder();
        while ((c = (char) inputStream.read()) != -1){
            if(c == '\n'){
                break;
            }
            stringBuilder.append(c);
        }
        if (stringBuilder.length() == 0){
            return null;
        }
        return stringBuilder;
    }

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://jandan.net/treehole");
        URLConnection connection = url.openConnection();
        InputStream inputStream = connection.getInputStream();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder temp;

        //获取输入流的所有数据，以行的形式读取
        while((temp = getLine(inputStream)) != null){
            stringBuilder.append(temp.toString());
        }
        String strings = stringBuilder.toString();
        stringBuilder = null;

        //正则匹配所有class 为text的标签
        List<String> textList = new ArrayList<String>();
        Pattern pattern = Pattern.compile("<div class=\"text\">(.|\n|\r)*?</div>");
        Matcher m = pattern.matcher(strings);
        while (m.find()){
            textList.add(m.group());
        }
        System.out.println(textList.size());

        //获取该子标签所有p里面的字符
        for (int i = 0; i < textList.size(); i++) {
            String subString  = textList.get(i).split("</?p>")[1];
            subString = subString.replaceAll("<br />", "\n");
            textList.set(i, new String(subString.getBytes("ISO-8859-1"), "utf-8"));
        }


        //将所有获取的数据存在数据库中
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8&useSSL=false", "root", "root");
            String sql = "insert into jandan_treehole value(?, ?)";
            PreparedStatement statement = connection1.prepareStatement(sql);
            for (int i = 0; i < textList.size(); i++) {
                statement.setInt(1, i);
                statement.setString(2, textList.get(i));
                statement.execute();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
