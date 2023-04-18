package certification.tutorials.basics.garbageCollectionTest;

/**
 * 
 * All three references point to the String object "lion" by the end of the
 * main() method. This makes the other two String objects eligible for garbage
 * collection
 *
 */
public class GarbageCollectionTest {
	public static void main(String[] ohMy) {
		String animal1 = new String("lion");
		String animal2 = new String("tiger");
		String animal3 = new String("bear");

		animal3 = animal1;
		animal2 = animal3;
		animal1 = animal2;

		System.out.println("animal1:" + animal1);
		System.out.println("animal2=" + animal2);
		System.out.println("animal3=" + animal3);
	}

}
