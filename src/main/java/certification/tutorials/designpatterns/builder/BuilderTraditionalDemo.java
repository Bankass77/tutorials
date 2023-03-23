package certification.tutorials.designpatterns.builder;

import certification.tutorials.designpatterns.builder.traditional.CheapComputerBuilder;
import certification.tutorials.designpatterns.builder.traditional.Computer;
import certification.tutorials.designpatterns.builder.traditional.ComputerDirector;
import certification.tutorials.designpatterns.builder.traditional.ExpensiveComputerBuilder;

public class BuilderTraditionalDemo {

	public static void main(String[] args) {

		ComputerDirector computerDirector = new ComputerDirector(new CheapComputerBuilder());
		computerDirector.setComputerBuilder(new CheapComputerBuilder());
		computerDirector.buildComputer();
		Computer computer = computerDirector.getComputer();
		System.out.println(computer);

		computerDirector.setComputerBuilder(new ExpensiveComputerBuilder());
		computerDirector.buildComputer();
		computer = computerDirector.getComputer();
		System.out.println(computer);

	}

}
