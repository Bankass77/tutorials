package certification.tutorials.basics;

public class AccessLevelTest1 {

	public static void main(String[] args) {

		AccessLevel al = new AccessLevel();
		// int a =al.v1 ; // A compile-error AccessLevelTest1.java:8: error: v1 has
		// private access in AccessLevel

		int b = al.v2;
		int c = al.v3;
		int d = al.v4;

		System.out.println("b=" + b + ",c=" + c + ",d=" + d);
		// al.m1(); /* A compile-time error */ AccessLevelTest1.java:15: error: m1() has
		// private access in AccessLevel
		al.m2();
		al.m3();
		al.m4();
		// Modify the values of instance variables
		al.v2 = 20;
		al.v3 = 30;
		al.v4 = 40;
		System.out.println("\nAfter modifying v2, v3 and v4");
		al.m2();
		al.m3();
		al.m4();
	}

}
