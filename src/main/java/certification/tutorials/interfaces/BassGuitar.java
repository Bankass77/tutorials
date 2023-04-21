package certification.tutorials.interfaces;

public interface BassGuitar {
	void strum();

	default int getVolume() {
		return 10;
	}

}
