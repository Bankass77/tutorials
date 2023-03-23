package certification.tutorials.basics;

public class DataTypes {

	public static void main(String[] args) {
		int num1 = 0x123;
		int num2 = 0xdecafe;
		int num3 = 0x1A2B;
		int num4 = 0X0123;

		System.out.println("num1=" + num1);
		System.out.println("num2=" + num2);
		System.out.println("num3=" + num3);
		System.out.println("num4=" + num4);

		char c1 = '\n'; // Assigns a linefeed to c1
		char c2 = '\"'; // Assigns double quote to c2
		// char c3= '\a'; // A compile-time error. Invalid character escape sequence

		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
	}

}
