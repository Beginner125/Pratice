public class ApplicantField extends BaseEntity {



	private String name;

	private String value;

	private String application_id;

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public String getValue(){
		return this.value;
	}
	public void setValue(String value){
		this.value = value;
	}

	public String getApplicationId(){
		return this.application_id;
	}
	public void setApplicationId(String application_id){
		this.application_id = application_id;
	}

	public String toString(){
		return ""
			+"name="+this.name
			+"value="+this.value
			+"application_id="+this.application_id;
	}


}