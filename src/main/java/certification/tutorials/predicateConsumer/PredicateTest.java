package certification.tutorials.predicateConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Le prédicat prend correctement une valeur double et renvoie un booléen. C'est
 * un prédicat compliqué, mais il se compile. Tout d'abord, le prédicat arrondit
 * le nombre à l'int le plus proche. Du côté droit du ==, le prédicat convertit
 * l'objet Double en une primitive double. Ensuite, il convertit l'objet en un
 * int, en supprimant tous les nombres après la virgule. Ne vous inquiétez pas
 * si vous n'avez jamais vu doubleValue() auparavant. N'oubliez pas que l'examen
 * peut utiliser des API que vous n'avez pas apprises, à condition qu'elles
 * fassent ce qu'elles semblent faire.
 * 
 * La méthode removeIf() supprime toutes les valeurs arrondies à l'unité
 * inférieure, puisque le prédicat renvoie un résultat vrai pour toutes les
 * valeurs dont le nombre arrondi est équivalent au nombre sans la valeur
 * décimale.
 * 
 * 
 *
 */
public class PredicateTest {

	public static void main(String[] args) {
		List<Double> numbers = new ArrayList<>();
		numbers.add(12.0);
		numbers.add(3.14);
		numbers.add(3.14);
		numbers.add(2.718);
		numbers.add(2.718);

		Predicate<Double> pred = n -> Math.round(n) == (int) n.doubleValue();

		numbers.removeIf(pred);

		System.out.println(numbers);
	}

}
