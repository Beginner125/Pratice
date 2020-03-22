public class TransferPost extends BaseEntity {



	private String staff_id;

	private String record_time;

	private String orginal_post;

	private String orginal_department;

	private String now_post;

	private String now_department;

	private String change_reason;

	public String getStaffId(){
		return this.staff_id;
	}
	public void setStaffId(String staff_id){
		this.staff_id = staff_id;
	}

	public String getRecordTime(){
		return this.record_time;
	}
	public void setRecordTime(String record_time){
		this.record_time = record_time;
	}

	public String getOrginalPost(){
		return this.orginal_post;
	}
	public void setOrginalPost(String orginal_post){
		this.orginal_post = orginal_post;
	}

	public String getOrginalDepartment(){
		return this.orginal_department;
	}
	public void setOrginalDepartment(String orginal_department){
		this.orginal_department = orginal_department;
	}

	public String getNowPost(){
		return this.now_post;
	}
	public void setNowPost(String now_post){
		this.now_post = now_post;
	}

	public String getNowDepartment(){
		return this.now_department;
	}
	public void setNowDepartment(String now_department){
		this.now_department = now_department;
	}

	public String getChangeReason(){
		return this.change_reason;
	}
	public void setChangeReason(String change_reason){
		this.change_reason = change_reason;
	}

	public String toString(){
		return ""
			+"staff_id="+this.staff_id
			+"record_time="+this.record_time
			+"orginal_post="+this.orginal_post
			+"orginal_department="+this.orginal_department
			+"now_post="+this.now_post
			+"now_department="+this.now_department
			+"change_reason="+this.change_reason;
	}


}