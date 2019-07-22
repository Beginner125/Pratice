package person.liming.test.test12;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author liuliming
 *  写一个Properties格式的配置文件，配置类的完整名称。写一个程序，
 *  读取这个Properties配置文件，获得类的完整名称并加载这个类，用反射的方式运行run方法
 */
public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties pro = new Properties();
		File file = new File("src/file/class.properties");
		InputStream in;
		
		try {
			if(!file.exists()){
				file.createNewFile();
			}
			
			//初始化
			in = new FileInputStream(file);
			pro.load(in);
			
			//获取配置信息
			String className = pro.getProperty("class.name");
			String run = pro.getProperty("class.run");
			
			//根据配置信息创建类对象
			Class<?> c = Class.forName(className);
			Object h = c.newInstance();
			
			//调用方法
			Method m = c.getMethod(run);
			m.invoke(h);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
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
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
