package person.liming.test.test57;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liuliming
 * @Description 装载XML，根据该XML文件（该文件中包含数据库表的信息），创建建立mysql数据库表的语句
 * @Description
 * @Date: Created in 10:432020/3/14
 */
public class Test57 {
    public static void main(String[] args) {
        //数据库操作相关对象
        DatabaseDAO databaseDAO = new DatabaseDAO();
        int re = 0;

        //XML解析相关对象
        File inputFile = new File("file/人力资源管理系统数据库概念表.xml");
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser;

        //进行解析，将xml转为内存结构数据
        ArrayList<DataTable> dataTables = new ArrayList<>();
        try {
            saxParser = factory.newSAXParser();
            DataTableHandler handler = new DataTableHandler();
            saxParser.parse(inputFile, handler);
            for (Object o :
                    handler.getTableHashMap().values()) {
                dataTables.add((DataTable) o);
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //开始连接数据库创建表
        try {
            databaseDAO.getConnection();
            for (DataTable table :
                    dataTables) {
                System.out.println(table.toString());
                databaseDAO.queryupdate(table.toString());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
