package person.liming.test.test20;

/**
 * @author liuliming
 *
 */
public enum Week {
	Monday("星期一"), Tuesday("星期二"), Wednesday("星期三"), Thursday("星期四"), Friday("星期五"), Saturday("星期六"), Sunday("星期天");

	private final String chinaName;
	
	private Week(String chinaName) {
		this.chinaName = chinaName;
	}
	
	public String getChinaName(){
		return chinaName;
	}
	
}