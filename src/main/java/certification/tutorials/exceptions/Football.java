package certification.tutorials.exceptions;

public class Football {
	public static void main(String officials[]) {
	      try {
	         System.out.print('W');
	         throw new ArrayIndexOutOfBoundsException();
	      } catch (RuntimeException r) {
	         System.out.print('X');
	         throw r;
	      } catch (Exception e) {
	         System.out.print('Y');
	      } finally {
	         System.out.print('Z');
	      }
	   }

}
