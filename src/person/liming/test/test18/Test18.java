package person.liming.test.test18;

import java.util.Scanner;

/**
 * @author liuliming
 * @Description 编写一个程序，它先将键盘上输入的一个字符串转换成十进制整数，然后打印出这个十进制整数对应的二进制形式。
 * @Description 这个程序要考虑输入的字符串不能转换成一个十进制整数的情况，并对转换失败的原因要区分出是数字太大，还是其中包含有非数字字符的情况。
 */
public class Test18 {
	
	public static void main(String[] args) {
		String inputStr;
		int decimal;
		StringBuffer outputBinary = new StringBuffer();
		Scanner scan = new Scanner(System.in);
		
		//输入数据
		inputStr = scan.next();
		
		//判断输入数据是否正确
		for(int i = 0, len = inputStr.length(); i < len; i++){
			char c = inputStr.charAt(i);
			if(c < '0' || c > '9'){
				System.out.println("存在非法字符");
			}
		}
		
		//将数据转化为int类型
		decimal = Integer.valueOf(inputStr);
		
		int bin = 2; //转化的进制
		
		//将该十进制转化为二进制字符
		while (decimal != 0){
			int s = (int)(decimal%bin);
			decimal = decimal/bin;
			char c = (char)(s + 48);
			outputBinary.append(c);
		}
		outputBinary.reverse();
		
		//输出
		outputBinary.append('B');
		System.out.println(outputBinary.toString());
	}
	
}
