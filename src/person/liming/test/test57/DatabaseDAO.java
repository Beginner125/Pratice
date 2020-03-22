package person.liming.test.test57;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseDAO {
	public static final String DBDIRVE = "com.mysql.cj.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/super_hrms?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8&useSSL=false";
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

	public int queryupdate(String sql, String[] params){
		Statement stm = null;
		ResultSet re = null;

		int result = 0;
		try {
			stm = connection.createStatement();
			result = stm.executeUpdate(sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public int queryupdate(String sql){
		return queryupdate(sql, null);
	}
}
