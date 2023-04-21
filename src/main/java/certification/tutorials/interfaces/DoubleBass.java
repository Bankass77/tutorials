package certification.tutorials.interfaces;

public interface DoubleBass {
	 void sum();
	 default int getVolume() {
		 return 5;
	 }

}
