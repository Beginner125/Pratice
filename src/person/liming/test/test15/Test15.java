package person.liming.test.test15;

/**
 * @author liuliming
 * @Description 声明一个共享数组，起两个线程，两个线程分别隔一段时间(可以写一个随机数)，给数组中添加数据，每一个线程为数组添加3个数据即可
 */
public class Test15 {

	public static void main(String[] args) {
		int[] data = new int[12];
		Group g = new Group(data);
		Thread thread1 = new Thread(new DataAdditor(g));
		Thread thread2 = new Thread(new DataAdditor(g));
		
		thread1.start();
		thread2.start();
		
	}

}
