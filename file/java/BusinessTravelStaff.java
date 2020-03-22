public class BusinessTravelStaff extends BaseEntity {



	private String begin_time;

	private String end_time;

	private String place;

	private String reason;

	private String staff_id;

	public String getBeginTime(){
		return this.begin_time;
	}
	public void setBeginTime(String begin_time){
		this.begin_time = begin_time;
	}

	public String getEndTime(){
		return this.end_time;
	}
	public void setEndTime(String end_time){
		this.end_time = end_time;
	}

	public String getPlace(){
		return this.place;
	}
	public void setPlace(String place){
		this.place = place;
	}

	public String getReason(){
		return this.reason;
	}
	public void setReason(String reason){
		this.reason = reason;
	}

	public String getStaffId(){
		return this.staff_id;
	}
	public void setStaffId(String staff_id){
		this.staff_id = staff_id;
	}

	public String toString(){
		return ""
			+"begin_time="+this.begin_time
			+"end_time="+this.end_time
			+"place="+this.place
			+"reason="+this.reason
			+"staff_id="+this.staff_id;
	}


}