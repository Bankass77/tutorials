package certification.tutorials.primitive;

public class ConvertProcessDemo {

	private boolean done;

	boolean f = false;
	// int fi=(int)f; cannot be converted to int

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public static void main(String[] args) {

		ConvertProcessDemo cp = new ConvertProcessDemo();
		System.out.println("Default value =" + cp.isDone());
	}

}
