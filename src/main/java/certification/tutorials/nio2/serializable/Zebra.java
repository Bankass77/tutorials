package certification.tutorials.nio2.serializable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Zebra implements Serializable {

	private static final long serialVersionUID = 1L;
	private transient String name = "Georges";
	private static String birthPlace = "Africa";
	private transient Integer age;

	List<Zebra> friends = new ArrayList<>();

	private Object stripes = new Object();
	{
		age = 10;
	}

	public Zebra() {
		this.name = "Sophia";
	}
	
	static Zebra writeAndRead( Zebra z) {
		return null;
		// Implementation omitted
		
	}

	
	public static void main(String[] args) {
		
		var zebra= new Zebra();
		zebra= writeAndRead(zebra);
		System.out.println(zebra);
	}
}
