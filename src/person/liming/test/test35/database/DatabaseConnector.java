package person.liming.test.test35.database;

import person.liming.test.test35.Config.Configurer;
import person.liming.test.test35.database.databaseJava.Table;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 13:482019/8/5
 */
public class DatabaseConnector {
    public  String URL;
    public  String DATABASE;
    public  String PERT;
    public  String USER;
    public  String PWD;
    public  String DRIVER;

    Connection connection;

    public DatabaseConnector() throws ClassNotFoundException, SQLException {
        //初始化参数
        DRIVER = (String) Configurer.getInstance().getParam("DRIVER");
        URL = (String) Configurer.getInstance().getParam("URL");
        DATABASE = (String) Configurer.getInstance().getParam("DATABASE");
        PERT = (String) Configurer.getInstance().getParam("PERT");
        USER = (String) Configurer.getInstance().getParam("USER");
        PWD = (String) Configurer.getInstance().getParam("PWD");
        Class.forName(DRIVER);
        connection = DriverManager.getConnection(URL+DATABASE+PERT, USER, PWD);
    }

    public List<String> getTablesName() throws SQLException {
        List<String> list = new ArrayList<>();
        DatabaseMetaData meta = connection.getMetaData();
        ResultSet rs = meta.getTables(DATABASE, null, null,
                new String[] { "TABLE" });
        while (rs.next()) {
            list.add(rs.getString(3));
        }
        return list;
    }

    public Table getTable(String tableName) throws SQLException {
        //获取元数据
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from "+tableName);
        ResultSetMetaData metaData = resultSet.getMetaData();
        //返回的Table
        Table table = new Table();
        table.setTableName(metaData.getTableName(1));
        //table中的List
        List<HashMap<String,String>> columns = table.getColumns();
        //输出列名
        for(int i = 1; i < metaData.getColumnCount(); i++){
            HashMap<String,String> column = new HashMap<String, String>();
            column.put("field", metaData.getColumnName(i));
            column.put("fieldType", metaData.getColumnTypeName(i));
            columns.add(column);
        }

        statement.close();
        resultSet.close();

        return table;
    }

}
