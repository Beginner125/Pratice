package person.liming.test.test11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author liuliming
 * @Description 编写程序，循环接收用户从键盘输入多个字符串，直到输入“end”时循环结束，并将所有已输入的字符串按字典顺序倒序打印
 */
public class Test11 {
	
	public static void main(String[] args) {
		List<String> inputData = new ArrayList<String>();
		String[] outData;
		Scanner scan = new Scanner(System.in);
		String singleData; 
		
		//获得输入的数据
		do {
			singleData = scan.next();
			inputData.add(singleData);
		} while (!singleData.equals("end"));
		
		//获得输出数据并排序
		outData = new String[inputData.size()];
		inputData.toArray(outData);
		Arrays.sort(outData, new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				//获得最小长度
				int len1 = o1.length();
				int len2 = o2.length();
				int minlen = len1 < len2? len1:len2;
				
				//根据每个字符排序
				for(int i = 0; i < minlen; i++){
					char c1 = o1.charAt(i);
					char c2 = o2.charAt(i);
					
					if(c1 < c2){
						return -1;
					}else if(c1 == c2){
						continue;
					}else{
						return 1;
					}
				}
				
				return  len1 < len2? -1:1;
			}
		});

		//输出数据
		for(String str:outData){
			System.out.println(str);
		}
	}
	
}
