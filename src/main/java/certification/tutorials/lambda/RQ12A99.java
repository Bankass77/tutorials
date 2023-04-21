package certification.tutorials.lambda;

public class RQ12A99 {

	public static void main(String[] args) {

		Funky1 p1;

		p1 = s -> System.out.println(s);
		p1 = s -> s.length();
		p1 = s -> s.toUpperCase();
		p1 = s -> {
			s.toUpperCase();
		};

		// p1= s-> {
		// return s.toUpperCase(); // The method of Funky1 is void, i cannot use a
		// keyword return in lambda expression
		// };

		
		
		Funky2 p2;
		
		p2= s->System.out.println(s);
		p2= s-> s.length();
		p2= s-> s.toUpperCase();
		//p2= s->{
		//	return s.toUpperCase();
		//};
		
		AgrementA a= ()->System.out.println("Java|");
		AgrementB b= ()-> System.out.println("Jive|");
		AgrementC c= ()->System.out.println("Jingle|");
		Object o= a=c;
		b= new Beta();
		System.out.println("---------a value------------------");
		a.doIt();
		System.out.println("--------- begining b value------------------");
		b.doIt();
		System.out.println("----------------- c  value--------------");
		c.doIt();
		System.out.println("------------cast value-------------");
		((AgrementA) o).doIt(); 
	}

}
