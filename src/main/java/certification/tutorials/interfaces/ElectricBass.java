package certification.tutorials.interfaces;

/**
 * 
 * The application does not compile. The
 * ElectricBass class does not compile, since it inherits two default methods
 * with the same signature. Even though the class is marked abstract, it still
 * must override this default method. Since ElectricBass fails to do so
 *
 */
public abstract class ElectricBass implements DoubleBass, BassGuitar {

	@Override
	public int getVolume() {

		return BassGuitar.super.getVolume();
	}

}
