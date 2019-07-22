package person.liming.test.test9;

/**
 * @author liuliming
 * 编写一个类，增加一个实例方法用于打印一条字符串。并使用反射手段创建该类的对象，并调用该对象中的方法
 */
public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> c;
		try {
			c = Class.forName("person.liming.test.test9.PrintHello");
			PrintHello hello = (PrintHello) c.newInstance();
			hello.print();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
