package certification.tutorials.classes;

/**
 * 
 * The code OstrichWrangler class is a static nested class; therefore, it cannot
 * access the instance member count.
 *
 */
public class TestAccesInstanceMember {
	private int count;

	static class OstrichWrangler {
		public int stampede() {
			return count;
		}
	}

}
