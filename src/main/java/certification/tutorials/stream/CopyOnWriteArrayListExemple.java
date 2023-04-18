package certification.tutorials.stream;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExemple {

	public static void main(String[] args) {

		// créer une instance de CopyWriteArrayList
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		System.out.println("avant la modification de  la list:");
		// ajout des élements à la liste
		list.add("Java");
		list.add("Python");
		list.add("C++");

		// Parcourir les élements de la liste

		for (String string : list) {

			System.out.println(string);
		}
		
		// modfier la liste

		list.add("JavaScript");

		// Parcourir les élements de la liste après modification
		System.out.println("Après la modification de  la list:");
		for (String string : list) {
			System.out.println(string);
		}

	}

}
