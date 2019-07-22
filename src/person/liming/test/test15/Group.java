package person.liming.test.test15;

import java.util.Arrays;

public class Group {
	int[] Group;
	private int index = 0;
	
	public Group(int[] group) {
		super();
		Group = group;
	}

	public synchronized void addData(int i){
		Group[index++] = i;
	}

	@Override
	public String toString() {
		return "Group [Group=" + Arrays.toString(Group) + ", index=" + index
				+ "]";
	}
	
}
