package certification.tutorials.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class ModifyingAttributesTest {

	public static void main(String[] args) throws IOException {
		var path = Paths.get("/home/lorumsum.txt");

		BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);

		BasicFileAttributes attributes = view.readAttributes();

		// Modify file last modified time

		FileTime time = FileTime.fromMillis(attributes.lastModifiedTime().toMillis() + 10_000);

		view.setTimes(time, null, null);
		System.out.println("Create Time : "+view.readAttributes().creationTime());
		System.out.println("Last accessing Time : "+ view.readAttributes().lastAccessTime());
		System.out.println("last Modifcation Time : "+view.readAttributes().lastModifiedTime());
	}

}
