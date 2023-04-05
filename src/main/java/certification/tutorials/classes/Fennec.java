package certification.tutorials.classes;

/**
 * 
 * The constructors are called from the child class upward, but since each line
 * of a constructor is a call to another constructor, via this() or super(),
 * they are ultimately executed in a top-down manner. On line 32, the main()
 * method calls the Fennec() constructor declared on line 22. Remember, integer
 * literals in Java are considered int by default. This constructor calls the
 * Fox() constructor defined on line 8, which in turn calls the overloaded
 * Fox() constructor declared on line 4. Since the constructor on line 11 does
 * not explicitly call a parent constructor, the compiler inserts a call to the
 * no-argument super() constructor, which exists on line 5 of the Canine class.
 * Line 5 is then executed, adding q to the output, and the compiler chain is
 * unwound. Line 4 then executes, adding p, followed by line 8, adding z.
 * Finally, line 24 is executed, and j is added, resulting in a final value for
 * logger of qpzj
 *
 */
public class Fennec extends Fox {

	public Fennec(int e) {
		super("tails");
		print("j");
	}

	public Fennec(short f) {
		super("eevee");
		print("m");
	}

	public static void main(String[] args) {
		System.out.println(new Fennec(1).view());
		

	}
}
