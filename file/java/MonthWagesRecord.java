public class MonthWagesRecord extends BaseEntity {



	private String id;

	private null date;

	private null time;

	private String staff_id;

	private int base_wages;

	private int fixed_wages;

	private int variable_wages;

	private int all_wages;

	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}

	public null getDate(){
		return this.date;
	}
	public void setDate(null date){
		this.date = date;
	}

	public null getTime(){
		return this.time;
	}
	public void setTime(null time){
		this.time = time;
	}

	public String getStaffId(){
		return this.staff_id;
	}
	public void setStaffId(String staff_id){
		this.staff_id = staff_id;
	}

	public int getBaseWages(){
		return this.base_wages;
	}
	public void setBaseWages(int base_wages){
		this.base_wages = base_wages;
	}

	public int getFixedWages(){
		return this.fixed_wages;
	}
	public void setFixedWages(int fixed_wages){
		this.fixed_wages = fixed_wages;
	}

	public int getVariableWages(){
		return this.variable_wages;
	}
	public void setVariableWages(int variable_wages){
		this.variable_wages = variable_wages;
	}

	public int getAllWages(){
		return this.all_wages;
	}
	public void setAllWages(int all_wages){
		this.all_wages = all_wages;
	}

	public String toString(){
		return ""
			+"id="+this.id
			+"date="+this.date
			+"time="+this.time
			+"staff_id="+this.staff_id
			+"base_wages="+this.base_wages
			+"fixed_wages="+this.fixed_wages
			+"variable_wages="+this.variable_wages
			+"all_wages="+this.all_wages;
	}


}