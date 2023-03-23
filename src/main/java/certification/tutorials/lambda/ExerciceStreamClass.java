package certification.tutorials.lambda;

import java.util.List;

public class ExerciceStreamClass {

	public static void main(String[] args) {

		ShoppingCart fruitCart = new ShoppingCart(List.of(new ShoppingArticle("Orange", 1.5),
				new ShoppingArticle("Apple", 1.7), new ShoppingArticle("Banana", 2.7)));

	}

	private static final class ShoppingArticle {

		final String name;
		final double price;

		public ShoppingArticle(String name, double price) {
			this.name = name;
			this.price = price;
		}
	}

	private static final class ShoppingCart {

		final List<ShoppingArticle> listArticles;

		public ShoppingCart(List<ShoppingArticle> myArticles) {

			this.listArticles = List.copyOf(myArticles);
		}
	}

}
