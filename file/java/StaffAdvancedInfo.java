public class StaffAdvancedInfo extends BaseEntity {



	private String type;

	private String staff_id;

	private String staff_pic;

	private String base_id;

	private int base_wages;

	private int post_wages;

	private String department;

	private String begin_worktime;

	private String contract;

	private String contract_type;

	private String contract_begintime;

	private String contract_endtime;

	private String rank;

	private String post;

	private String task;

	private String wort_place;

	private String post_begintime;

	private String superior_id;

	public String getType(){
		return this.type;
	}
	public void setType(String type){
		this.type = type;
	}

	public String getStaffId(){
		return this.staff_id;
	}
	public void setStaffId(String staff_id){
		this.staff_id = staff_id;
	}

	public String getStaffPic(){
		return this.staff_pic;
	}
	public void setStaffPic(String staff_pic){
		this.staff_pic = staff_pic;
	}

	public String getBaseId(){
		return this.base_id;
	}
	public void setBaseId(String base_id){
		this.base_id = base_id;
	}

	public int getBaseWages(){
		return this.base_wages;
	}
	public void setBaseWages(int base_wages){
		this.base_wages = base_wages;
	}

	public int getPostWages(){
		return this.post_wages;
	}
	public void setPostWages(int post_wages){
		this.post_wages = post_wages;
	}

	public String getDepartment(){
		return this.department;
	}
	public void setDepartment(String department){
		this.department = department;
	}

	public String getBeginWorktime(){
		return this.begin_worktime;
	}
	public void setBeginWorktime(String begin_worktime){
		this.begin_worktime = begin_worktime;
	}

	public String getContract(){
		return this.contract;
	}
	public void setContract(String contract){
		this.contract = contract;
	}

	public String getContractType(){
		return this.contract_type;
	}
	public void setContractType(String contract_type){
		this.contract_type = contract_type;
	}

	public String getContractBegintime(){
		return this.contract_begintime;
	}
	public void setContractBegintime(String contract_begintime){
		this.contract_begintime = contract_begintime;
	}

	public String getContractEndtime(){
		return this.contract_endtime;
	}
	public void setContractEndtime(String contract_endtime){
		this.contract_endtime = contract_endtime;
	}

	public String getRank(){
		return this.rank;
	}
	public void setRank(String rank){
		this.rank = rank;
	}

	public String getPost(){
		return this.post;
	}
	public void setPost(String post){
		this.post = post;
	}

	public String getTask(){
		return this.task;
	}
	public void setTask(String task){
		this.task = task;
	}

	public String getWortPlace(){
		return this.wort_place;
	}
	public void setWortPlace(String wort_place){
		this.wort_place = wort_place;
	}

	public String getPostBegintime(){
		return this.post_begintime;
	}
	public void setPostBegintime(String post_begintime){
		this.post_begintime = post_begintime;
	}

	public String getSuperiorId(){
		return this.superior_id;
	}
	public void setSuperiorId(String superior_id){
		this.superior_id = superior_id;
	}

	public String toString(){
		return ""
			+"type="+this.type
			+"staff_id="+this.staff_id
			+"staff_pic="+this.staff_pic
			+"base_id="+this.base_id
			+"base_wages="+this.base_wages
			+"post_wages="+this.post_wages
			+"department="+this.department
			+"begin_worktime="+this.begin_worktime
			+"contract="+this.contract
			+"contract_type="+this.contract_type
			+"contract_begintime="+this.contract_begintime
			+"contract_endtime="+this.contract_endtime
			+"rank="+this.rank
			+"post="+this.post
			+"task="+this.task
			+"wort_place="+this.wort_place
			+"post_begintime="+this.post_begintime
			+"superior_id="+this.superior_id;
	}


}