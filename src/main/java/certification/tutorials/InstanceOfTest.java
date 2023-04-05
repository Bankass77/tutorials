package certification.tutorials;

/**
 * 
 * The first two pattern-matching statements compile without issue. The variable
 * bat is allowed to be used again, provided it is no longer in scope. Line 36
 * does not compile, though. Due to flow scoping, if s is not a Long, then bat
 * is not in scope in the expression bat ˂= 20. Line 38 also does not compile as
 * default cannot be used as part of an if/else statement.
 *
 */
public class InstanceOfTest {

	void printType(Object o) {
		
		if(o instanceof Integer bat) {
			
			System.out.println("int");
		}else if(o instanceof Integer bat && bat <10){
			System.out.print("small int ");
		} else if(o instanceof Long bat || bat <=20) {
			System.out.print("long");
		}
		defaut{
			System.out.println( "unknow");
		}
	}

	public static void main(String[] args) {

	}

}
