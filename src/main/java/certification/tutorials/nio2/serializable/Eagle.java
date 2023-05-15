package certification.tutorials.nio2.serializable;

import java.io.Serializable;

public class Eagle  extends Bird  implements Serializable{

	private static final long serialVersionUID = 1L;

	{ this.name= "Olivia";}
	
	public Eagle() {
		this.name= "Bridget";
	}
	
	
	public static void main(String[] args) {
		var e= new Eagle();
		e.name= "Adeline";
	}
}
