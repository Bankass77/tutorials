package certification.tutorials.designpatterns.builder.traditional;

/**
 * 
 * 
 *
 */
public class Computer {

	private String display = null;

	private String systemBlock = null;
	private String manipulators = null;

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getSysmtemBlock() {
		return systemBlock;
	}

	public void setSysmtemBlock(String sysmtemBlock) {
		this.systemBlock = sysmtemBlock;
	}

	public String getManipulators() {
		return manipulators;
	}

	public void setManipulators(String manipulators) {
		this.manipulators = manipulators;
	}

	@Override
	public String toString() {
		return "Computer [display=" + display + ", sysmtemBlock=" + systemBlock + ", manipulators=" + manipulators
				+ "]";
	}

}
