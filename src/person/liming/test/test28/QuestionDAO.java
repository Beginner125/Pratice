package person.liming.test.test28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class QuestionDAO {
	public static final String DBDIRVE = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/questions?useUnicode=true&characterEncoding=utf-8";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";
	
	Connection connection;
	
	public Connection getConnection() throws ClassNotFoundException, SQLException{
		if(connection == null){
			Class.forName(DBDIRVE);
			connection = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
		}
		return connection;
	}
	public List<Object> querySingle(String sql, String[] resultName){
		Statement stm = null;
		ResultSet re = null;

		List<Object> result = new ArrayList<Object>();
		try {
			stm = connection.createStatement();
			re = stm.executeQuery(sql);
			while(re.next()){
				for(String s:resultName){
					result.add(re.getObject(s));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
}
