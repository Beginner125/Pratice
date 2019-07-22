package person.liming.test;

/**
 * @author liuliming
 * 用代码证明，在try中写了return，后面又写了finally，是先执行return还是先执行fianlly
 */
public class Test23 {
	public static void main(String[] args) {
		try {
			System.out.println("hello");
			return;
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			System.out.println("world");
		}
	}
}
