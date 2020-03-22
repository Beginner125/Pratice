public class Access extends BaseEntity {



	private String name;

	private String link;

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public String getLink(){
		return this.link;
	}
	public void setLink(String link){
		this.link = link;
	}

	public String toString(){
		return ""
			+"name="+this.name
			+"link="+this.link;
	}


}