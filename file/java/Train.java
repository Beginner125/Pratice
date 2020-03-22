public class Train extends BaseEntity {



	private String applicant_id;

	private String title;

	private String place;

	private String speecher;

	private String begin_time;

	private String end_time;

	private String id;

	public String getApplicantId(){
		return this.applicant_id;
	}
	public void setApplicantId(String applicant_id){
		this.applicant_id = applicant_id;
	}

	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title;
	}

	public String getPlace(){
		return this.place;
	}
	public void setPlace(String place){
		this.place = place;
	}

	public String getSpeecher(){
		return this.speecher;
	}
	public void setSpeecher(String speecher){
		this.speecher = speecher;
	}

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

	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}

	public String toString(){
		return ""
			+"applicant_id="+this.applicant_id
			+"title="+this.title
			+"place="+this.place
			+"speecher="+this.speecher
			+"begin_time="+this.begin_time
			+"end_time="+this.end_time
			+"id="+this.id;
	}


}