package certification.tutorials.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Example10 {

	public static void main(String[] args) {

		// LinkedHashSet va ajouter les élements à la collection selon leur ordre
		// d'arrivé
		Set set1 = new LinkedHashSet();
		set1.add(35);
		set1.add(19);
		set1.add(11);
		set1.add(83);
		set1.add(7);
		System.out.println(set1);

	}

}
