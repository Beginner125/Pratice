public class StaffCheckRequire extends BaseEntity {



	private String applicant_id;

	private null date;

	private null begin_time;

	private null end_time;

	private String place;

	private String everyday;

	private String aim_staffs;

	public String getApplicantId(){
		return this.applicant_id;
	}
	public void setApplicantId(String applicant_id){
		this.applicant_id = applicant_id;
	}

	public null getDate(){
		return this.date;
	}
	public void setDate(null date){
		this.date = date;
	}

	public null getBeginTime(){
		return this.begin_time;
	}
	public void setBeginTime(null begin_time){
		this.begin_time = begin_time;
	}

	public null getEndTime(){
		return this.end_time;
	}
	public void setEndTime(null end_time){
		this.end_time = end_time;
	}

	public String getPlace(){
		return this.place;
	}
	public void setPlace(String place){
		this.place = place;
	}

	public String getEveryday(){
		return this.everyday;
	}
	public void setEveryday(String everyday){
		this.everyday = everyday;
	}

	public String getAimStaffs(){
		return this.aim_staffs;
	}
	public void setAimStaffs(String aim_staffs){
		this.aim_staffs = aim_staffs;
	}

	public String toString(){
		return ""
			+"applicant_id="+this.applicant_id
			+"date="+this.date
			+"begin_time="+this.begin_time
			+"end_time="+this.end_time
			+"place="+this.place
			+"everyday="+this.everyday
			+"aim_staffs="+this.aim_staffs;
	}


}