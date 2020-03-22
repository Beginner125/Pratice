public class Role extends BaseEntity {



	private String name;

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public String toString(){
		return ""
			+"name="+this.name;
	}


}