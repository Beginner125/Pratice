package person.liming.test.test15;

public class DataAdditor implements Runnable {
	
	Group g;
	
	public DataAdditor(Group g) {
		super();
		this.g = g;
	}

	@Override
	public void run() {
		
		for(int i = 0; i < 3; i++){
			g.addData((int)(Math.random()*100));
		}
		System.out.println(g.toString());
		
	}

}
