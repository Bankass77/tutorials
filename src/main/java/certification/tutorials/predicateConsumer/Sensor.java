package certification.tutorials.predicateConsumer;

public interface Sensor {

	int batteryHealth();

	void batteryHealth(int health);

	boolean trigerred();

	void triggered(boolean state);

}
