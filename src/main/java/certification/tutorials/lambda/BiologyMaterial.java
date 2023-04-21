package certification.tutorials.lambda;

public class BiologyMaterial implements Study {

	@Override
	public int learn(String subject, int duration) {
		if (subject == null)
			return duration;
		else
			return duration + 1;
	}
}
