package person.liming.test.test8;

public enum TrafficLight {
	RED("红灯", 1), YELLOW("黄灯", 2), GREEN("绿灯", 3);
	
	private String name;
	private int index;
	
	private TrafficLight(String name, int index) {
		this.name = name;
		this.index = index;
	}

	public TrafficLight nextLight(){
		//转到下一个灯
		switch (this) {
		case RED:
			return YELLOW;
		case YELLOW:
			return GREEN;
		default:
			return RED;
		}
		
	}
}
