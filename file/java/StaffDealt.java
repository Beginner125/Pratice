public class StaffDealt extends BaseEntity {



	private String date;

	private String content;

	private String finish;

	public String getDate(){
		return this.date;
	}
	public void setDate(String date){
		this.date = date;
	}

	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content = content;
	}

	public String getFinish(){
		return this.finish;
	}
	public void setFinish(String finish){
		this.finish = finish;
	}

	public String toString(){
		return ""
			+"date="+this.date
			+"content="+this.content
			+"finish="+this.finish;
	}


}