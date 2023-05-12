package certification.tutorials.nio2;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
public class Gorilla  implements Serializable{

	private String name;

	private int age;

	private boolean isGorille;

	public Gorilla(String string) {

		this.name = string;

	}

	public Gorilla(String string, int i, boolean b) {

		this.name = string;
		this.age = i;
		this.isGorille = b;

	}

}
