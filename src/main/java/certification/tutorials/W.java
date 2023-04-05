package certification.tutorials;

/**
 * 
 * Y is both a class and a type parameter. This means that within the class Z,
 * when we refer to Y, it uses the type parameter. All of the choices that
 * mention class Y are incorrect because it no longer means the class Y
 *
 */
public class W {

}

class X extends W {
}

class Y extends X {
}

class Z<Y> {

}
