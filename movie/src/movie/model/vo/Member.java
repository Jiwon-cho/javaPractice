package movie.model.vo;

public class Member {
	private String name;
	private String idnumber;
	private String id;
	private String pw;
	/**
	 * 
	 */
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param idnumber
	 * @param id
	 * @param pw
	 */
	public Member(String name, String idnumber, String id, String pw) {
		super();
		this.name = name;
		this.idnumber = idnumber;
		this.id = id;
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", idnumber=" + idnumber + ", id=" + id + ", pw=" + pw + "]";
	}
	
	

}
