package model;

public class Member {
	private String name;
	private String id;
	private String pwd;


	public Member() {
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", pwd=" + pwd + "]";
	}
	
	
	
}

