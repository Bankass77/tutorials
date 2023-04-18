package certification.tutorials.sealed;

/**
 * 
 * A sealed subclass must have a final, sealed, or non-sealed modifier. For this
 * reason, Second compiles. A record is implicitly final, so Hour also compiles.
 * Micro compiles since it extends a non-sealed class. Minute is the only one
 * that does not compile since an interface is implicitly abstract and is
 * missing sealed or non-sealed,
 *
 */
public sealed interface Time permits Hour, Minute, Second {

}

record Hour() implements Time {
}

interface Minute extends Time {
}

non-sealed class Second implements Time {
}

class Micro extends Second {
}
