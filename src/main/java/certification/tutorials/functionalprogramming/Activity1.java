package certification.tutorials.functionalprogramming;

import java.util.HashMap;
import java.util.Map;

public class Activity1 {

	public static void main(String[] args) {

	}

	public static final class ShoppingCard {

		private final Map<String, Integer> shoppingItmes;

		public ShoppingCard(Map<String, Integer> lMap) {

			this.shoppingItmes = lMap;
		}

		public ShoppingCard removeItem(ShoppingItem shoppingItem) {

			Map<String, Integer> listMap = new HashMap<String, Integer>(shoppingItmes);

			int value = 0;

			if (listMap.containsKey(shoppingItem.name)) {

				value = listMap.get(shoppingItem.name);
			}

			if (value > 0) {

				listMap.put(shoppingItem.name, --value);

			}
			return new ShoppingCard(listMap);
		}

		public ShoppingCard addItem(ShoppingItem shoppingItem) {

			Map<String, Integer> newMap = new HashMap<String, Integer>(shoppingItmes);

			int value = 0;

			if (newMap.containsKey(shoppingItem.name)) {

				value = newMap.get(shoppingItem.name);

			}
			newMap.put(shoppingItem.name, ++value);
			return new ShoppingCard(newMap);

		}

		public ShoppingCard addItem(ShoppingItem... items) {

			Map<String, Integer> newList = new HashMap<String, Integer>(shoppingItmes);

			ShoppingCard card = null;
			for (ShoppingItem shoppingItem : items) {

				card = addItem(shoppingItem);

				newList.put(shoppingItem.name, shoppingItem.price);
			}

			return card;

		}

	}

	public static final class ShoppingItem {

		private final String name;

		private final int price;

		public ShoppingItem(String name, int price) {

			this.name = name;
			this.price = price;
		}
	}

}
