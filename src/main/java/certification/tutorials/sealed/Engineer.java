package certification.tutorials.sealed;

import certification.tutorials.interfaces.Gender;

public non-sealed class Engineer extends Human{

	public Engineer(String name, int age, float height) {
		super(name, age, height);
		
	}

	
	public Engineer(String name, int age, float height, Gender gender) {
		
		super(name, age, height, gender);
	}
	
}
