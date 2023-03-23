package certification.tutorials.interfaces;

public abstract class Human {
	
	public static final int LIFESPAN=100;
	protected String name;
	protected float height;
	protected int age;
	private Gender gender;
	public Human(String name, float height, int age, Gender gender) {
		super();
		this.name = name;
		this.height = height;
		this.age = age;
		this.gender = gender;
	}
	public Human(String name, int age, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	

}
