package certification.tutorials.interfaces;

public interface Artist {
	String getSchool();

	public static final int LIFESPAN = 100;

	void setSchool(String school);

	default boolean isCreative() {

		explain();
		return true;
	}

	private void explain() {

		System.out.println("A true artist has a creative nature.");
	}

	public static String capitalize(String name) {

		Character character = name.charAt(0);
		if (Character.isLowerCase(character)) {

			Character characterUpperCase = Character.toUpperCase(character);
			name.replace(character, characterUpperCase);
		}
		return name;

	}
}
