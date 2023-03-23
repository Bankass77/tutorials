package certification.tutorials.designpatterns.builder.traditional;

public class CheapComputerBuilder extends ComputerBuilder {

	@Override
	public void buildSystemBlock() {
		computer.setSysmtemBlock("Everest");

	}

	@Override
	public void buildDisplay() {
		computer.setDisplay("CRT");

	}

	@Override
	public void buildManipulators() {
		computer.setManipulators("mousse + keybaord");

	}

}
