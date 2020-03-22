public class StaffAcount extends BaseEntity {



	private String account;

	private String password;

	private String roles_id;

	private String staff_id;

	public String getAccount(){
		return this.account;
	}
	public void setAccount(String account){
		this.account = account;
	}

	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password = password;
	}

	public String getRolesId(){
		return this.roles_id;
	}
	public void setRolesId(String roles_id){
		this.roles_id = roles_id;
	}

	public String getStaffId(){
		return this.staff_id;
	}
	public void setStaffId(String staff_id){
		this.staff_id = staff_id;
	}

	public String toString(){
		return ""
			+"account="+this.account
			+"password="+this.password
			+"roles_id="+this.roles_id
			+"staff_id="+this.staff_id;
	}


}