package person.liming.test.test30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Repite {
	
	public StringBuffer Connect(String address){
		HttpURLConnection conn= null;
		URL url = null;
		BufferedReader reader = null;
		StringBuffer stringbuffer = new StringBuffer();
		
		try {
			//获得连接
			url = new URL(address);
			conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(5000);
			conn.setDoInput(true);
			conn.connect();
			//获取输入流
			InputStream in = conn.getInputStream();
			reader = new BufferedReader(new InputStreamReader(in, "utf-8"));
			//转化为stringbuffer
			String s;
			while( (s = reader.readLine()) != null ){
				stringbuffer.append(s);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return stringbuffer;
	}
}
