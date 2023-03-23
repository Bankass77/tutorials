package certification.tutorials.accessLevel;

public class Program {

	static int x = 20;

	public static void main(String[] args) {
		Program pr = new Program();
		pr.x = 5;
		int y = x / pr.x;
		System.out.println("y=");
		System.out.println();
		System.out.println(y);
	}

}
