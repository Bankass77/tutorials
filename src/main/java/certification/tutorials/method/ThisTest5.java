package certification.tutorials.method;

public class ThisTest5 {

	int num = 1987; // An instance variable

	public static void main(String[] args) {

		ThisTest5 tt5 = new ThisTest5();

		tt5.pintNum(1987);
	}

	void pintNum(int num) {

		System.out.println("Parameter  num: " + num);
		System.out.println("Instance variable num: " + num);

	}
}
