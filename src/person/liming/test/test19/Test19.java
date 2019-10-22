package person.liming.test.test19;

import java.util.Arrays;

/**
 * @author liuliming
 * @Description 已知一个int数组，用冒泡排序法对数组中元素进行升序排列（简单题也不放过）
 */
public class Test19 {

	public static void main(String[] args) {
		int[] g = new int[]{0,4,6,2,24,8,-99};
		
		//从数组最大值到1的循环，循环冒泡最大值
		for(int len = g.length-1, i = len; i > 0; i--){
		
			for(int j = 0; j < i; j++){
				
				if(g[j] > g[j+1]){
					int temp = g[j];
					g[j] = g[j+1];
					g[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(g));
	}

}
