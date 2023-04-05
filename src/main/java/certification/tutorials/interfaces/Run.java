package certification.tutorials.interfaces;

import java.util.ArrayList;

public interface Run   extends Walk{
	 public ArrayList move(); }
	class Leopard implements Walk {
	   public   move() {  // X
	      return null;
	   }
	}
	class Panther implements Run {
	   public move() {  // Z
	      return null;
	   }

}
