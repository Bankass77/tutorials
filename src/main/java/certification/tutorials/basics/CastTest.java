package certification.tutorials.basics;

public class CastTest {

	public static  void main(String[] args) {
		long ear = 10;
		//int hearing =(int)( 2 * ear);    // work
		//int hearing =( 2 * (short)ear); // work
		int hearing =( 2 * (int)ear); // work
		System.out.println(hearing);

	}

}
