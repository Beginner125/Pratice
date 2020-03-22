public class ChangeWagesRecord extends BaseEntity {



	private String send_id;

	private String recive_id;

	private null date;

	private int money;

	private String reason;

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

	public null getDate(){
		return this.date;
	}
	public void setDate(null date){
		this.date = date;
	}

	public int getMoney(){
		return this.money;
	}
	public void setMoney(int money){
		this.money = money;
	}

	public String getReason(){
		return this.reason;
	}
	public void setReason(String reason){
		this.reason = reason;
	}

	public String toString(){
		return ""
			+"send_id="+this.send_id
			+"recive_id="+this.recive_id
			+"date="+this.date
			+"money="+this.money
			+"reason="+this.reason;
	}


}