package review.model.vo;

public  class Review2 {
	
	private String name;
	private int age;
	private char gender;
	private static int count;
	private static int like;
	
	
	{
		name="Á¶Áö¿ø";
		age=29;
		gender='m';
	}
	
	static{
		count=100;
		like=200;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Review2.count = count;
	}

	public static int getLike() {
		return like;
	}

	public static void setLike(int like) {
		Review2.like = like;
	}

}
