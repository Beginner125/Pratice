public class StaffNotices extends BaseEntity {



	private String send_id;

	private String recive_ids;

	private String content;

	public String getSendId(){
		return this.send_id;
	}
	public void setSendId(String send_id){
		this.send_id = send_id;
	}

	public String getReciveIds(){
		return this.recive_ids;
	}
	public void setReciveIds(String recive_ids){
		this.recive_ids = recive_ids;
	}

	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content = content;
	}

	public String toString(){
		return ""
			+"send_id="+this.send_id
			+"recive_ids="+this.recive_ids
			+"content="+this.content;
	}


}