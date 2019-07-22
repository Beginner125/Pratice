package person.liming.test.test6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SymbolInputStream {
	private BufferedReader reader;
	private int lineIndex = 0;

	public SymbolInputStream(String pathname) throws IOException {
		super();
		File file = new File(pathname);
		//判断文件是否存在
		if(!file.exists()){
			file.createNewFile();
		}
		
		//初始化输入流
		reader = new BufferedReader(new FileReader(file));
		reader.mark(200);;
	}
	
	//读取一行
	public String readLine() throws IOException{
		String str = reader.readLine();
		if(str == null){
			return null;
		}
		lineIndex++;
		return "第" + String.valueOf(lineIndex) + "行:" + str;
	}
	
	//读取特定行的函数
	public String readLine(int index) throws IOException{
		reader.reset();
		String str = reader.readLine();
		lineIndex++;
		//如果为空，说明文件为空返回空值
		if(str == null){
			return null;
		}
		if(index == 1){
			return "第" + String.valueOf(index) + "行:" + str;
		}
		
		int i = 1;
		
		//取得某行的文本数据返回
		while(str != null){
			i++;
			this.lineIndex++;
			str = reader.readLine();
			if(i == index){
				return "第" + String.valueOf(index) + ":" + str;
			}
		}
		//index超出文件行数，返回空
		return null;
	}
	
	//包装reset函数
	public void reset() throws IOException{
		reader.reset();
	}
	
	public void close() throws IOException{
		reader.close();
	}
}
