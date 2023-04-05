package certification.tutorials.basics;

public class AssigneByteToInt {

	public static void main(String[] args) {
		int start = 7;
		int end = 4;
		end += ++start;
		start = (byte)(Byte.MAX_VALUE + 1);
		System.out.println("start:"+start);
		System.out.println("end:"+end);
	}

}
