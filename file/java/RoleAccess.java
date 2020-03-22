public class RoleAccess extends BaseEntity {



	private String role_id;

	public String getRoleId(){
		return this.role_id;
	}
	public void setRoleId(String role_id){
		this.role_id = role_id;
	}

	public String toString(){
		return ""
			+"role_id="+this.role_id;
	}


}