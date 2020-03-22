public class ApplicantTamplate extends BaseEntity {



	private String name;

	private int is_system;

	private String field_id;

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public int getIsSystem(){
		return this.is_system;
	}
	public void setIsSystem(int is_system){
		this.is_system = is_system;
	}

	public String getFieldId(){
		return this.field_id;
	}
	public void setFieldId(String field_id){
		this.field_id = field_id;
	}

	public String toString(){
		return ""
			+"name="+this.name
			+"is_system="+this.is_system
			+"field_id="+this.field_id;
	}


}