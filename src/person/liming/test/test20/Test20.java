package person.liming.test.test20;

/**
 * @author liuliming
 * @Description 自定义枚举week表示星期几，要求每个枚举值都有tolocaleString方法。返回中文格式的星期几。
 */
public class Test20 {

	public static void main(String[] args) {
		Week day = Week.Sunday;
		System.out.println(day.toString());
		System.out.println(day.getChinaName());
	}

}
