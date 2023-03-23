package certification.tutorials.designpatterns.builder.traditional;

public class ComputerDirector {

	private ComputerBuilder computerBuilder;

	public ComputerDirector(ComputerBuilder computerBuilder) {
		super();
		this.computerBuilder = computerBuilder;
	}

	public Computer getComputer() {
		return computerBuilder.getComputer();
	}

	public void setComputerBuilder(ComputerBuilder computerBuilder) {
		this.computerBuilder = computerBuilder;
	}

	public void buildComputer() {

		computerBuilder.createNewComputer();
		computerBuilder.buildSystemBlock();
		computerBuilder.buildDisplay();
		computerBuilder.buildManipulators();
	}

}
