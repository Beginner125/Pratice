public class ApplicantFieldTamplate extends BaseEntity {



	private String name;

	private String type;

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public String getType(){
		return this.type;
	}
	public void setType(String type){
		this.type = type;
	}

	public String toString(){
		return ""
			+"name="+this.name
			+"type="+this.type;
	}


}