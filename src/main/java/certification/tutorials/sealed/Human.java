package certification.tutorials.sealed;

import certification.tutorials.interfaces.Gender;

public sealed class Human implements Mammal permits Performer, Engineer {

	protected String name;
	protected int age;
	protected float height;

	public Human(String name, int age, float height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public Human(String name, int age2, float height, Gender gender) {
		super();
		this.name = name;
		this.age = age2;
		this.height = height;
	}

}
