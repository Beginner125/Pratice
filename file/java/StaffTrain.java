public class StaffTrain extends BaseEntity {



	private String id;

	private String staff_id;

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

	public String toString(){
		return ""
			+"id="+this.id
			+"staff_id="+this.staff_id;
	}


}