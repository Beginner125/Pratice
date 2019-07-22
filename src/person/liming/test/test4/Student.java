package person.liming.test.test4;

public class Student{
	String name;
	int score1;
	int score2;
	int score3;
	
	public Student(String name, int score1, int score2, int score3) {
		super();
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}
	
	int scoreAll(){
		return score1+score2+score3;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score1=" + score1 + ", score2="
				+ score2 + ", score3=" + score3 + "]";
	}
	
	
}
