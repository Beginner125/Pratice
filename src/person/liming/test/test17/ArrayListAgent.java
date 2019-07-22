package person.liming.test.test17;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListAgent {
	List list;
	Method[] methods;

	public ArrayListAgent(List stringGroup) {
		super();
		this.list = stringGroup;
		methods = this.list.getClass().getMethods();
		
		//显示方法
//		for(Method method:methods){
//			System.out.println(method.getName());
//		}
	}
	
	public Object invoke(String methodName, Object...args) throws NoSuchMethodError, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		//查找指定方法
		for(Method method : methods){
			
			//调用指定方法，计算并输出调用时间
			if(method.getName().equals(methodName)){
				long preTime = System.nanoTime();
				Object re = (Object)method.invoke(list, args);
				long rap = System.nanoTime() - preTime;
				printRapTime(methodName, rap);
				return re;
			}
			
		}
		
		//抛出找不到方法的异常
		throw new NoSuchMethodError("找不到方法"+methodName);
	}
	
	//以指定方式输出方法调用时间间隔
	protected void printRapTime(String methodName, long rap){
		System.out.println("调用"+methodName+"时间间隔为："+rap+"纳秒");
	}
}
