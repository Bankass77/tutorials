package certification.tutorials.nio2.serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class BabyChimpanzee extends Chimpanzee {

	private static final long serialVersionUID = 1L;

	private String mother = "Mom";

	public BabyChimpanzee() {

		super();
	}

	public BabyChimpanzee(String name, char type) {
		super(name, 0, type);
		this.mother = name;

	}

}
