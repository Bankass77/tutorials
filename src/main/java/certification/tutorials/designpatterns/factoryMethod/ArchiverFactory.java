package certification.tutorials.designpatterns.factoryMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ArchiverFactory {

	private static Map<String, Supplier<Archiver>> typeConstructorMap = new HashMap<String, Supplier<Archiver>>();

	static {
		typeConstructorMap.put("zip", ZipArchiver::new);
		typeConstructorMap.put("rar", RarArchiver::new);
	}

	public static Archiver getArchiver(String architype) {

		return typeConstructorMap.get(architype) == null ? null : typeConstructorMap.get(architype).get();
	}
}
