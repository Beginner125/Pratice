package person.liming.test.test2;

/**
 * @author liuliming
 * 假如我们在开发一个系统时需要对员工进行建模，【员工】包含3个属性
 * 经理】也是员工，除了含有员工的属性外，另为还有一个奖金属性
 * 请使用继承的思想设计出员工类和经理类。要求类中提供必要的方法进行属性访问
 */
public class Manager extends Employee {
	protected int prize;

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}
	
}
