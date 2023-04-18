package certification.tutorials.abstractDeclaration;

/**
 * 
 * The code may look complicated, but it does not compile for a simple reason.
 * The abstract read() method defined in Book cannot have a method body. Since
 * it does, the code does not compile
 *
 */
public class Encyclopedia  extends Book{
	 public static String material = "cellulose";
	   public Encyclopedia() {super();}
	   public String read() { return "Reading is fun!"; }
	   public String getMaterial() {return super.material;}

	   public static void main(String[] pages) {
	      System.out.print(new Encyclopedia().read());
	      System.out.print("-" + new Encyclopedia().getMaterial());
	   } 

}
