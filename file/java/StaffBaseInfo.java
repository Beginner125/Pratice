public class StaffBaseInfo extends BaseEntity {



	private String name;

	private String sex;

	private String identity;

	private String picture;

	private String tele;

	private String emer_tele;

	private String address;

	private String native_place;

	private String nation;

	private String political;

	private String marriage;

	private String graduate_school;

	private String highest_degree;

	private String account_char;

	private null birth_date;

	private String maior;

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public String getSex(){
		return this.sex;
	}
	public void setSex(String sex){
		this.sex = sex;
	}

	public String getIdentity(){
		return this.identity;
	}
	public void setIdentity(String identity){
		this.identity = identity;
	}

	public String getPicture(){
		return this.picture;
	}
	public void setPicture(String picture){
		this.picture = picture;
	}

	public String getTele(){
		return this.tele;
	}
	public void setTele(String tele){
		this.tele = tele;
	}

	public String getEmerTele(){
		return this.emer_tele;
	}
	public void setEmerTele(String emer_tele){
		this.emer_tele = emer_tele;
	}

	public String getAddress(){
		return this.address;
	}
	public void setAddress(String address){
		this.address = address;
	}

	public String getNativePlace(){
		return this.native_place;
	}
	public void setNativePlace(String native_place){
		this.native_place = native_place;
	}

	public String getNation(){
		return this.nation;
	}
	public void setNation(String nation){
		this.nation = nation;
	}

	public String getPolitical(){
		return this.political;
	}
	public void setPolitical(String political){
		this.political = political;
	}

	public String getMarriage(){
		return this.marriage;
	}
	public void setMarriage(String marriage){
		this.marriage = marriage;
	}

	public String getGraduateSchool(){
		return this.graduate_school;
	}
	public void setGraduateSchool(String graduate_school){
		this.graduate_school = graduate_school;
	}

	public String getHighestDegree(){
		return this.highest_degree;
	}
	public void setHighestDegree(String highest_degree){
		this.highest_degree = highest_degree;
	}

	public String getAccountChar(){
		return this.account_char;
	}
	public void setAccountChar(String account_char){
		this.account_char = account_char;
	}

	public null getBirthDate(){
		return this.birth_date;
	}
	public void setBirthDate(null birth_date){
		this.birth_date = birth_date;
	}

	public String getMaior(){
		return this.maior;
	}
	public void setMaior(String maior){
		this.maior = maior;
	}

	public String toString(){
		return ""
			+"name="+this.name
			+"sex="+this.sex
			+"identity="+this.identity
			+"picture="+this.picture
			+"tele="+this.tele
			+"emer_tele="+this.emer_tele
			+"address="+this.address
			+"native_place="+this.native_place
			+"nation="+this.nation
			+"political="+this.political
			+"marriage="+this.marriage
			+"graduate_school="+this.graduate_school
			+"highest_degree="+this.highest_degree
			+"account_char="+this.account_char
			+"birth_date="+this.birth_date
			+"maior="+this.maior;
	}


}