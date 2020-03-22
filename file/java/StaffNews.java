public class StaffNews extends BaseEntity {



	private String send_id;

	private String recive_id;

	private String news;

	public String getSendId(){
		return this.send_id;
	}
	public void setSendId(String send_id){
		this.send_id = send_id;
	}

	public String getReciveId(){
		return this.recive_id;
	}
	public void setReciveId(String recive_id){
		this.recive_id = recive_id;
	}

	public String getNews(){
		return this.news;
	}
	public void setNews(String news){
		this.news = news;
	}

	public String toString(){
		return ""
			+"send_id="+this.send_id
			+"recive_id="+this.recive_id
			+"news="+this.news;
	}


}