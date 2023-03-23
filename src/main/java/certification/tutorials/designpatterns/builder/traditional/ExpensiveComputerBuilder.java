package certification.tutorials.designpatterns.builder.traditional;

public class ExpensiveComputerBuilder extends ComputerBuilder {

	@Override
	public void buildSystemBlock() {
		computer.setSysmtemBlock("Vinga odin");

	}

	@Override
	public void buildDisplay() {
		computer.setDisplay("IPS");

	}

	@Override
	public void buildManipulators() {
		computer.setManipulators("mouse + keybaord+ second_monitor");

	}

}
