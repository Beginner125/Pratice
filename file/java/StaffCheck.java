public class StaffCheck extends BaseEntity {



	private String id;

	private String staff_id;

	private String sign_id;

	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}

	public String getStaffId(){
		return this.staff_id;
	}
	public void setStaffId(String staff_id){
		this.staff_id = staff_id;
	}

	public String getSignId(){
		return this.sign_id;
	}
	public void setSignId(String sign_id){
		this.sign_id = sign_id;
	}

	public String toString(){
		return ""
			+"id="+this.id
			+"staff_id="+this.staff_id
			+"sign_id="+this.sign_id;
	}


}