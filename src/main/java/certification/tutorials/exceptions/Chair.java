package certification.tutorials.exceptions;

public class Chair {
	 public void sit() throws IllegalArgumentException {
	      System.out.print("creak");
	      throw new RuntimeException();
	   }

}
