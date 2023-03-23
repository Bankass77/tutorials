package certification.tutorials.recursion;

public class RunForever {

	public static void main(String[] args) {

		RunForever runForever = new RunForever();
		runForever.add(1);
	}

	public int add(int num) {

		return add(num + 1);
	}

}
