public class Department extends BaseEntity {



	private String name;

	private int staff_num;

	private String superior_department;

	private int level;

	private String email;

	private String leading_staff;

	private String address;

	private String duty;

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public int getStaffNum(){
		return this.staff_num;
	}
	public void setStaffNum(int staff_num){
		this.staff_num = staff_num;
	}

	public String getSuperiorDepartment(){
		return this.superior_department;
	}
	public void setSuperiorDepartment(String superior_department){
		this.superior_department = superior_department;
	}

	public int getLevel(){
		return this.level;
	}
	public void setLevel(int level){
		this.level = level;
	}

	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}

	public String getLeadingStaff(){
		return this.leading_staff;
	}
	public void setLeadingStaff(String leading_staff){
		this.leading_staff = leading_staff;
	}

	public String getAddress(){
		return this.address;
	}
	public void setAddress(String address){
		this.address = address;
	}

	public String getDuty(){
		return this.duty;
	}
	public void setDuty(String duty){
		this.duty = duty;
	}

	public String toString(){
		return ""
			+"name="+this.name
			+"staff_num="+this.staff_num
			+"superior_department="+this.superior_department
			+"level="+this.level
			+"email="+this.email
			+"leading_staff="+this.leading_staff
			+"address="+this.address
			+"duty="+this.duty;
	}


}