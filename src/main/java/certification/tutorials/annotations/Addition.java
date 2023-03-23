package certification.tutorials.annotations;

public class Addition implements Operation {

	@Override
	public int execute(int a, int b) {

		return a + b;
	}

}
