package person.liming.test.test8;

/**
 * @author liuliming
 * @Description 定义一个交通灯枚举，包含红灯、绿灯、黄灯，需要有获得下一个灯的方法，例如：红灯获取下一个灯是绿灯，绿灯获取下一个灯是黄灯
 */
public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficLight light = TrafficLight.RED;
		System.out.println(light.toString());
		TrafficLight nextlight = light.nextLight();
		System.out.println(nextlight.nextLight());
	}

}
