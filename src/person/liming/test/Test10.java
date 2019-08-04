package person.liming.test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liuliming
 * 把当前文件中的所有文本拷贝，存入一个txt文件，统计每个字符出现的次数并输出
 */
public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File(".");
		File aimFile = new File("file/currentDirInfo.txt");
		Map<Character, Integer> total = new HashMap<Character, Integer>();
		String[] fileInfo;
		RandomAccessFile inAndOut;
		
		try {
			//判断目的文件是否存在
			if(!aimFile.exists()){
				file.createNewFile();
			}
			
			//初始化
			inAndOut = new RandomAccessFile(aimFile, "rw");
			fileInfo = file.list();
			
			//统计当前目录每个字符出现的次数
			for(String info:fileInfo){
				for(int i = 0, len = info.length(); i < len; i++){
					Character c = info.charAt(i);
					Integer t = total.get(c);
					if(t == null){
						total.put(c, 1);
					}else{
						total.put(c, ++t);
					}
				}
			}
			
			//将内容输出到目的文件中
			for(String info:fileInfo){
				inAndOut.writeBytes(info);
				inAndOut.writeChar('\n');
			}
			inAndOut.writeBytes(total.toString());
			inAndOut.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
