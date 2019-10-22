package person.liming.test.test1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuliming
 * @Description 取出一个字符串中字母出现的次数。如：字符串：”abcdekka27qoq”，输出各个字符的次数
 * @Date: forget
 */
public class Test1 {

	public static void main(String[] args) {
		String str = "qqqqqqqqqqqqqqqqq";
		Map<Character, Integer> total = new HashMap<Character, Integer>();
		
		//统计字符中的数据
		for(int i = 0, len = str.length(); i < len; i++){
			char c = str.charAt(i);
			Integer a = total.get(c);
			if(a == null){
				total.put(c, 1);
			}else{
				total.put(c, ++a);
			}
		}
		
		System.out.println(total.get(new Character('q')));
		System.out.println(total.toString());
	}
	
}
