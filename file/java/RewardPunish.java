public class RewardPunish extends BaseEntity {



	private String type;

	private int money;

	private String date;

	private String reason;

	private String send_id;

	private String recive_id;

	public String getType(){
		return this.type;
	}
	public void setType(String type){
		this.type = type;
	}

	public int getMoney(){
		return this.money;
	}
	public void setMoney(int money){
		this.money = money;
	}

	public String getDate(){
		return this.date;
	}
	public void setDate(String date){
		this.date = date;
	}

	public String getReason(){
		return this.reason;
	}
	public void setReason(String reason){
		this.reason = reason;
	}

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

	public String toString(){
		return ""
			+"type="+this.type
			+"money="+this.money
			+"date="+this.date
			+"reason="+this.reason
			+"send_id="+this.send_id
			+"recive_id="+this.recive_id;
	}


}