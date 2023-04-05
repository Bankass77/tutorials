package certification.tutorials.basics;

/**
 * 
 * @param <X>
 * @param t
 * @param x   The catchBall() and spinBall() methods do not compile because X is
 *            valid only for instance methods. fetchBall() has the ˂X˃ in the
 *            wrong place. It needs to be after the static keyword. The other
 *            methods all compile. inflateBall()
 *            redefines X so the type on Ball is hidden. This means both
 *            parameters refer to the same type.
 */
public class Ball<X> {
	
	public static <T> void catchBall(T t, X x) {
	}

	public <T> void dribbleBall(T t, X x) {
	}

	public <X> static void fetchBall(X t, X x) {}

	public <X> void inflateBall(X t, X x) {
	}

	public <T> static void spinBall(T t, X x) {}

	public static <X> void throwBall(X t, X x) {
	}
}
