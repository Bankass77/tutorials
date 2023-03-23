package certification.tutorials.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class ArchiverFactory {

	private static Map<String, Archiver> prototypes = new HashMap<String, Archiver>();

	static {
		prototypes.put("zip", new ZipArchiver());
		prototypes.put("rar", new RarArchiver());
	}

	public static Archiver getPrototypeForType(String archiveType) {
		return prototypes.get(archiveType).clone();

	}
}
