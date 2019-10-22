package person.liming.test.test22;

import java.util.Scanner;

/**
 * @author liuliming
 * @Description 编写一个可以获取文件扩展名的函数，形参接收一个文件名字符串，返回一个扩展名字符串
 */
public class Test22 {
	
	public static void main(String[] args) {
		String testName = "hell.txt.pic";
		System.out.println(getExtendsName(testName));
	}
	
	public static String getExtendsName(String fileName){
		String extendsName;
		int len = fileName.length();
		int i = len-1;
		
		for(; i > 0; i--){
			if(fileName.charAt(i) == '.'){
				break;
			}
		}
		
		extendsName = fileName.substring(i+1, len);
		return extendsName;
	}
}
