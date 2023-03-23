package certification.tutorials.method;

public class ThisTest4 {

	int num = 1982; // An instance Variable

	public static void main(String[] args) {

		ThisTest4 tt4 = new ThisTest4();
		tt4.printNum();
	}

	void printNum() {
		System.out.println("Instance variable num: " + num);
	}

}
