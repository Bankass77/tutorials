package certification.tutorials.string;

/**
 * 
 * La méthode replace () de la classe StringBuilder en Java est utilisée pour
 * remplacer une partie spécifique de la chaîne de caractères contenue dans
 * l'objet StringBuilder par une autre chaîne de caractères. où: debut : est
 * l'index de début (inclusif) de la sous-chaîne à remplacer. fin : est l'index
 * de fin (exclusif) de la sous-chaîne à remplacer. str : la chaîne de
 * caractères par laquelle remplacer la sous-chaîne spécifiée. La méthode
 * replace() renvoie l'objet StringBuilder avec la chaîne de caractères
 * modifiée. La signature de la méthode replace() est la suivante
 *
 */
public class StringBuilderReplaceMethod {

	public static void main(String[] args) {
		var string = "12345";
		var builder = new StringBuilder("12345");
		System.out.println(builder.charAt(4));
		System.out.println(builder.replace(2, 4, "6").charAt(3));
		System.out.println(builder.replace(2, 5, "6").charAt(2));
		// System.out.println(builder.replace(2, 4, "6").charAt(3)); Compile but Throw a
		// StringIndexOutOfBoundsException
		System.out.println(string.charAt(5)); // Compile but Throw a StringIndexOutOfBoundsException
		//System.out.println(string.length); // not complile
		System.out.println(string.replace("123", "1").charAt(2));
	}

}
