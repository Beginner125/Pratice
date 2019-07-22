package person.liming.test;

import java.util.Random;

/**
 * @author liuliming
 * 编写一个程序，获取10个1至20的随机数，要求随机数不能重复
 */
public class Test14 {

	public static void main(String[] args) {
		int[] randNum = new int[10];
		Random rand = new Random(System.currentTimeMillis());
		
		//获取十个不相同的随机数
		for(int i = 0; i < 10; i++){
			int v;
			
			//不断取得随机数直到取到不重复的值
			//注意，当随机范围小于要获得的随机数个数时陷入无限循环
			do {
				v = rand.nextInt(20)+1;
			} while (repeat(randNum, v));
			
			randNum[i] = v;
		}
		
		//输出
		for(int i:randNum){
			System.out.print(i);
			System.out.print(' ');
		}
	}
	
	
	public static boolean repeat(int[] group, int value){
		
		for(int i : group){
			if(value == i){
				return true;
			}
		}
		
		return false;
	}
}
