package person.liming.test.test30;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 * @author liuliming
 * @Description 写一个爬虫程序，爬取https://sports.163.com/nba/的新闻消息，并且放在文件里，每个文件大小为20条消息。
 */
public class Test30 {

	public static void main(String[] args) {
		Repite repite = new Repite();
		StringBuffer content;
		content = repite.Connect("http://localhost:8080/");
		List<String> out = PatternFast.getImg(content);
		File file = new File("file/url.txt");

		try {
			if(!file.exists()){
				file.createNewFile();
			}
			RandomAccessFile inout = new RandomAccessFile(file, "rw");
			out.get(0).replaceAll("			", "\n");
			inout.write(out.get(0).getBytes());
			inout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(out.get(0).replaceAll("   +", "\n"));
	}
}
