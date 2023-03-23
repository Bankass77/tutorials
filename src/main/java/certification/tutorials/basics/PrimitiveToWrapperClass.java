package certification.tutorials.basics;

public class PrimitiveToWrapperClass {

	public static void main(String[] args) {

		boolean vrai = Boolean.valueOf(true);

		System.out.println("boolean: " + vrai);
		System.out.println("---------------------");
		byte b = Byte.valueOf(Byte.MAX_VALUE);
		System.out.println("byte : " + b);
		System.out.println("----------------------");
		short s = Short.valueOf((short) 1);
		System.out.println("short:  " + s);
		System.out.println("-------------------");
		int i = Integer.valueOf(Integer.MAX_VALUE);
		System.out.println("Int :" + i);
		System.out.println("-----------------------------");
		long l = Long.valueOf(2);
		System.out.println("long :" + l);
		System.out.println("--------------------------");
		float f = Float.valueOf((float) 4.0);
		System.out.println("float :" + f);
		System.out.println("-----------------------------------------");
		double d = Double.valueOf(5.0);

		System.out.println("double:  " + d);
		System.out.println("--------------------------");
		char c = Character.valueOf('C');
		System.out.println("char : " + c);

		System.out.println("---------------------");
		int primitif = Integer.parseInt("123");
		System.out.println("primitif =" + primitif);

		System.out.println("-------------");

		Integer wrapper = Integer.valueOf("123");
		System.out.println("wrapper = " + wrapper);
		Double apple = Double.valueOf("200.99");

		System.out.println("int value is: " + apple.intValue());
		System.out.println("byte value is : " + apple.byteValue());
		System.out.println("float value is = " + apple.floatValue());

		String textbloc = """

				"Java Study Guide"
				   by Scott & Jeanne

				""";

		System.out.println("text block = " + textbloc);

		// String bloc= """ does"""; // Doest not compile beacause The Text block
		// require a line break after the openning """
		String bloc2 = """

				does \
				deer
				""";
		System.out.println("bloc: " + bloc2);

		String bloc3 = """

				does \n
				deer
				""";
		System.out.println("bloc: " + bloc3);

		String bloc4 = """
				"doe\"\"\"
				\"deer\"""
				""";
		System.out.println("* " + bloc4 + "*");

		final int y = 10;
		int x = 20;
		// y = x + 10; // does not compile

		final int[] favoriteNumbers = new int[10];
		favoriteNumbers[0] = 10;
		favoriteNumbers[1] = 20;
		// favoriteNumbers = null; // does not compile

	}

	public int valid() {
		int y = 10;
		int x; // x is declared here
		x = 3; // x is initialized here
		int z; // z is declared here but never initialized or used

		int reply = x + y; // does not compile

		return reply;

	}

	public void findAnswer(boolean check) {
		int answer;

		int otherAnswer;
		int onlyOnebranch;
		if (check) {
			onlyOnebranch = 1;
			answer = 1;

		} else {
			answer = 2;

		}

		System.out.println(answer);
		System.out.println(onlyOnebranch);// Does not compile, it initialized in if block, but not in else block

	}

	public void checkAnswer() {

		boolean value;
		findAnswer(value); // Does not compile , because value is not initialized
	}

}
