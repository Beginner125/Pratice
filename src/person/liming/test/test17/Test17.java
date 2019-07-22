package person.liming.test.test17;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liuliming
 * 写一个ArrayList类的代理，实现和ArrayList类中完全相同的功能，并可以计算每个方法运行的时间
 */
public class Test17 {
	
	public static void main(String[] args) {
		List<String> stringGroup = new ArrayList<String>();
		ArrayListAgent agent;
		
		//给list添加数据
		stringGroup.add("I");
		stringGroup.add("success");
		stringGroup.add("invoke");
		
		//初始化agent对象
		agent = new ArrayListAgent(stringGroup);
		
		try {
			
			//调用指定方法(无参)
			agent.invoke("toString");
			
			//调用指定方法(有参)
			Integer s = (Integer)agent.invoke("size");
			System.out.println(s);
			
		} catch (NoSuchMethodError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
