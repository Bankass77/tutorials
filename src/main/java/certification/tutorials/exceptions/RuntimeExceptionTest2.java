package certification.tutorials.exceptions;

public class RuntimeExceptionTest2 {
	class SpellingException extends RuntimeException {}
	public class SpellChecker {
	   public final static void main(String[] participants) {
	      try {
	         if(!"cat".equals("kat")) {
	            new SpellingException();
	         }
	      } catch (SpellingException | NullPointerException e) {
	         System.out.println("Spelling problem!");
	      } catch (Exception e) {
	         System.out.println("Unknown Problem!");
	      } finally {
	         System.out.println("Done!");
	      } }
	}
}
