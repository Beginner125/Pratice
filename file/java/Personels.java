public class Personels extends BaseEntity {



	private String name;

	private String age;

	private String pic;

	private String hunting_post;

	private String tel;

	private String graduate_school;

	private String id;

	private String marriage;

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public String getAge(){
		return this.age;
	}
	public void setAge(String age){
		this.age = age;
	}

	public String getPic(){
		return this.pic;
	}
	public void setPic(String pic){
		this.pic = pic;
	}

	public String getHuntingPost(){
		return this.hunting_post;
	}
	public void setHuntingPost(String hunting_post){
		this.hunting_post = hunting_post;
	}

	public String getTel(){
		return this.tel;
	}
	public void setTel(String tel){
		this.tel = tel;
	}

	public String getGraduateSchool(){
		return this.graduate_school;
	}
	public void setGraduateSchool(String graduate_school){
		this.graduate_school = graduate_school;
	}

	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}

	public String getMarriage(){
		return this.marriage;
	}
	public void setMarriage(String marriage){
		this.marriage = marriage;
	}

	public String toString(){
		return ""
			+"name="+this.name
			+"age="+this.age
			+"pic="+this.pic
			+"hunting_post="+this.hunting_post
			+"tel="+this.tel
			+"graduate_school="+this.graduate_school
			+"id="+this.id
			+"marriage="+this.marriage;
	}


}