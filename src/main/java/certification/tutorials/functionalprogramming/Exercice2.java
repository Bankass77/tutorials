package certification.tutorials.functionalprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercice2 {

	public static void main(String[] args) {

		ShoppingCard firstShoppingCard = new ShoppingCard(new ArrayList<Exercice2.ShoppingItem>());
		ShoppingCard secondShoppingCard = firstShoppingCard.addItems(new ShoppingItem("Chait", 150));
		ShoppingCard thirdShoppingCard = secondShoppingCard.addItems(new ShoppingItem("Table", 350));

		List<ShoppingItem> books = new ArrayList<Exercice2.ShoppingItem>();
		books.add(new ShoppingItem("Java Fundamentals", 100));
		books.add(new ShoppingItem("Java 17", 300));

		List<ShoppingItem> immutableCopy = List.copyOf(books);
		List<ShoppingItem> unmodifiedCopy = Collections.unmodifiableList(books);

		System.out.println(thirdShoppingCard);

		System.out.println("---------------------------------------");
		System.out.println(immutableCopy);
		System.out.println(unmodifiedCopy);

		books.remove(0);

		System.out.println("---------------------------------------");
		System.out.println(immutableCopy);
		System.out.println(unmodifiedCopy);

	}

	// Classe interne
	public static final class ShoppingCard {

		List<ShoppingItem> mItems = new ArrayList<ShoppingItem>();

		public ShoppingCard(List<ShoppingItem> list) {

			mItems = Collections.unmodifiableList(list);
		}

		public ShoppingCard addItems(ShoppingItem shoppingItem) {

			List<ShoppingItem> newList = new ArrayList<Exercice2.ShoppingItem>(mItems);
			newList.add(shoppingItem);
			return new ShoppingCard(newList);

		}

		@Override
		public String toString() {

			StringBuilder sb = new StringBuilder("Cart:");
			for (int i = 0; i < mItems.size(); i++) {

				sb.append(mItems.get(i)).append(",");

			}
			return sb.toString();

		}

	}

	// Classe interne
	private static final class ShoppingItem {
		private final String name;

		private final int price;

		public ShoppingItem(String name, int price) {

			this.name = name;
			this.price = price;
		}

		// @Override
		public String toSting() {
			return name + "," + price;
		}
	}

}
