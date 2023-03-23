package certification.tutorials.method;

public class ThisTest6 {

	int num = 1986; // An instance Variable

	public static void main(String[] args) {

		ThisTest6 tt6 = new ThisTest6();

		tt6.pintNum(455);
	}

	void pintNum(int num) {

		System.out.println("Parameter num:" + num);
		System.out.println("Instance variable num: " + this.num);
	}

}
