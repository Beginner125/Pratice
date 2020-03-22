public class Applicant extends BaseEntity {



	private String applicant_id;

	private String type_id;

	private String file;

	private String content;

	private String time;

	private String reason;

	private String one_auditor;

	private String two_aduitor;

	private String three_aduitor;

	private String end_time;

	public String getApplicantId(){
		return this.applicant_id;
	}
	public void setApplicantId(String applicant_id){
		this.applicant_id = applicant_id;
	}

	public String getTypeId(){
		return this.type_id;
	}
	public void setTypeId(String type_id){
		this.type_id = type_id;
	}

	public String getFile(){
		return this.file;
	}
	public void setFile(String file){
		this.file = file;
	}

	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content = content;
	}

	public String getTime(){
		return this.time;
	}
	public void setTime(String time){
		this.time = time;
	}

	public String getReason(){
		return this.reason;
	}
	public void setReason(String reason){
		this.reason = reason;
	}

	public String getOneAuditor(){
		return this.one_auditor;
	}
	public void setOneAuditor(String one_auditor){
		this.one_auditor = one_auditor;
	}

	public String getTwoAduitor(){
		return this.two_aduitor;
	}
	public void setTwoAduitor(String two_aduitor){
		this.two_aduitor = two_aduitor;
	}

	public String getThreeAduitor(){
		return this.three_aduitor;
	}
	public void setThreeAduitor(String three_aduitor){
		this.three_aduitor = three_aduitor;
	}

	public String getEndTime(){
		return this.end_time;
	}
	public void setEndTime(String end_time){
		this.end_time = end_time;
	}

	public String toString(){
		return ""
			+"applicant_id="+this.applicant_id
			+"type_id="+this.type_id
			+"file="+this.file
			+"content="+this.content
			+"time="+this.time
			+"reason="+this.reason
			+"one_auditor="+this.one_auditor
			+"two_aduitor="+this.two_aduitor
			+"three_aduitor="+this.three_aduitor
			+"end_time="+this.end_time;
	}


}