package person.liming.test.test6;

import java.io.IOException;

/**
 * @author liuliming
 * @Description 自定义字符输入流的包装类，通过这个包装类对底层字符输入流进行包装，
 * @Description 让程序通过这个包装类读取某个文本文件（例如，一个java源文件）时，能够在读取的每行前面都加上有行号和冒号
 */
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SymbolInputStream input = new SymbolInputStream("src/file/stu.txt");
			System.out.println(input.readLine());
			System.out.println(input.readLine(1));
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
