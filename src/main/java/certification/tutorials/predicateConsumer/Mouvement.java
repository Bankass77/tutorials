package certification.tutorials.predicateConsumer;

public class Mouvement implements Sensor {

	private int batteryHealth;

	private boolean isTriggered;

	private int ambientLight;

	public Mouvement(int batteryHealth, boolean isTriggered, int ambientLight) {
		super();
		this.batteryHealth = batteryHealth;
		this.isTriggered = isTriggered;
		this.ambientLight = ambientLight;
	}

	@Override
	public int batteryHealth() {

		return batteryHealth;
	}

	@Override
	public void batteryHealth(int health) {

	}

	@Override
	public boolean trigerred() {

		return isTriggered;
	}

	@Override
	public void triggered(boolean state) {

	}

	public int ambientLight() {

		return ambientLight;
	}

}
