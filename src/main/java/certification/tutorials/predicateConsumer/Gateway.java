package certification.tutorials.predicateConsumer;

public class Gateway implements Sensor {

	private int batteryHealth;

	private boolean trigerred;

	public Gateway(int batteryHealth, boolean trigerred) {
		super();
		this.batteryHealth = batteryHealth;
		this.trigerred = trigerred;
	}

	@Override
	public int batteryHealth() {

		return batteryHealth;
	}

	@Override
	public void batteryHealth(int health) {
		this.batteryHealth = health;

	}

	@Override
	public boolean trigerred() {

		return trigerred;
	}

	@Override
	public void triggered(boolean state) {
		trigerred = state;

	}

}
