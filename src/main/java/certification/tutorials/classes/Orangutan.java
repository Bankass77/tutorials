package certification.tutorials.classes;

public class Orangutan {
	
	protected int age= 4;
	
	{
		age= 5;
	}
	
	public Orangutan () {
		
		this().age=6;
	}

	public static void main(String[] args) {
		
		
		final Primate x=(Primate) new Orangutan();
		System.out.println(x.age);
	}

}
