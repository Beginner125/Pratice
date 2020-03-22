public class StaffCert extends BaseEntity {



	private String name;

	private String orgnaziton;

	private String begin_time;

	private String end_time;

	private String owner_id;

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public String getOrgnaziton(){
		return this.orgnaziton;
	}
	public void setOrgnaziton(String orgnaziton){
		this.orgnaziton = orgnaziton;
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

	public String getOwnerId(){
		return this.owner_id;
	}
	public void setOwnerId(String owner_id){
		this.owner_id = owner_id;
	}

	public String toString(){
		return ""
			+"name="+this.name
			+"orgnaziton="+this.orgnaziton
			+"begin_time="+this.begin_time
			+"end_time="+this.end_time
			+"owner_id="+this.owner_id;
	}


}