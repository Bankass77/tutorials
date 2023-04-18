package certification.tutorials.basics;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * This class does not implement Serializable. This code is well encapsulated
 * because the instance variables are private. While the instance variable
 * references do not change after the object is created, the contents of fauna
 * can be modified, so it is not immutable. The class Forest is immutable
 * because all of its fields are declared as final, and their values are set
 * only once during object creation in the constructor. Therefore, the state of
 * the object cannot be changed after it is created. However, the class is not
 * well encapsulated because it exposes its internal state by providing public
 * accessors for the flora and fauna fields. Anyone with a reference to the
 * Forest object can access and modify the List of fauna objects, which could
 * lead to unintended changes to the object's state. To fix this, the getFauna()
 * method should return a read-only view of the List to prevent external
 * modification, such as by returning an unmodifiable list like
 * Collections.unmodifiableList(fauna)
 */
public class Forest {
	private final int flora;

	private final List<String> fauna;

	public Forest() {
		this.flora = 5;
		this.fauna = new ArrayList<>();
	}

	public int getFlora() {
		return flora;
	}

	public List<String> getFauna() {
		return fauna;
	}
}
