package certification.tutorials.basics;

public class Tornado {
	static class House implements AutoCloseable {
	      public void close() {
	         throw new RuntimeException("Cellar door stuck");
	      }
	      public void open() {}
	   }
	   public static void main(String[] args) {
	      House house1 = new House();
	      house1.open();
	      try (house1; House house2 = new House()) {
	         throw new RuntimeException("House flew away");
	      } catch (Exception e) {
	         System.out.println(e.getMessage()
	            + " " + e.getSuppressed().length);
	      }
	      house1.open();  // m1
	   } 

}
