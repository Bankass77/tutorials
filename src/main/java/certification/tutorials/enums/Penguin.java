package certification.tutorials.enums;

/**
 * It compiles as is. Removing private on line 8 would not create an additional
 * compiler error. Removing the static modifier on line 3 would not create an
 * additional compiler error.
 *
 */
public class Penguin {
	private enum Baby {
		EGG
	}

	static class Chick {
		enum Baby {
			EGG
		}
	}

	public static void main(String[] args) {
		boolean match = false;
		Baby egg = Baby.EGG;
		switch (egg) {
		case EGG:
			match = true;
		}
	}

}
