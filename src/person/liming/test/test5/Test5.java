package person.liming.test.test5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author liuliming
 * @Description 定义一个文件输入流，调用read(byte[]b)方法将文件中的所有内容打印出来(byte数组的大小限制为5)
 * @Date: forget
 */
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("src/file/stu.txt");
		byte[] data = new byte[5];
		FileInputStream input;
		
		try {
			
			//判断文件是否存在，不存在创建
			if(!file.exists()){
				file.createNewFile();
			}
			
			//输入流初始化
			input = new FileInputStream(file);
			
			//从输入流中读取数据并打印
			int flag = input.read(data);;
			while (flag != -1) {
				System.out.println(new String(data));
				flag = input.read(data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
