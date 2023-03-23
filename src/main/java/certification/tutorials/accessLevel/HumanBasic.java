package certification.tutorials.accessLevel;

import certification.tutorials.interfaces.Gender;

public class HumanBasic {

	public static void main(String[] args) {

		for (Gender gender : Gender.values()) {
			System.out.println(gender.getClass());
		}

	}

}
