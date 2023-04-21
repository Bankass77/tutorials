package certification.tutorials.generics;

/**
 * 
 * The generic declaration on line R is not valid due to the question mark (?) wildcard. While a question mark is allowed on the left side of a declaration, it is not allowed when specifying a constraint on a class. Since line R does not compile,
 *
 */
public class Fur<? extends Mammal> {   // line R
	
	 var bat = new Fur<Bat>();  // line S
     var cat = new Fur<Cat>();  // line T
     var sat = new Fur<Sat>();  // line U
  

}
