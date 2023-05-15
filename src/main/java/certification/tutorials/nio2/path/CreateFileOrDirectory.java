package certification.tutorials.path;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Stream;

public class CreateFileOrDirectory {

	public void nio() throws IOException {

		var path = Path.of("/home", "lorumsum.txt");

		if (Files.exists(path)) {
			System.out.println("Absolute Path: " + path.toAbsolutePath());
			System.out.println("Is directory: " + Files.isDirectory(path));
			System.out.println("Parent Path:" + path.getParent());
			if (Files.isRegularFile(path)) {

				System.out.println("Size: " + Files.size(path));
				System.out.println("Last Modified: " + Files.getLastModifiedTime(path));

			} else {

				try (Stream<Path> stream = Files.list(path)) {
					stream.forEach(p -> System.out.println(" " + p.getFileName()));

				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		
		Path zooPath1 = FileSystems.getDefault().getPath("/home", "lorumsum.txt");
		System.out.println(zooPath1);

		Path zooPath2 = FileSystems.getDefault().getPath("/home", "tiger", "data", "stripes.txt");
		System.out.println(" ");
		System.out.println(zooPath2);

		CreateFileOrDirectory createFileOrDirectory = new CreateFileOrDirectory();

		createFileOrDirectory.nio();

		Path path = Paths.get("schedule.xml");

		boolean exist = Files.exists(path, LinkOption.NOFOLLOW_LINKS);
		System.out.println("------NIO Optional Parameters----------------");
		System.out.println(exist);

		//Path path2 = Files.move(zooPath2, zooPath1, LinkOption.NOFOLLOW_LINKS, StandardCopyOption.REPLACE_EXISTING);
		//path2.toRealPath(LinkOption.NOFOLLOW_LINKS);
		//System.out.println(path2);

		System.out.println("---------Path isntance is immutable----------------");
		Path path3 = Path.of("whale");
		path3.resolve("krill");
		System.out.println(path3); // whale
		
		System.out.println("---------Chainning differents methods----------------");
		
		System.out.println(Path.of("/zoo/../home").getParent().normalize().toAbsolutePath());
		
		System.out.println("------------------getNameCount() and getName() of path------------------");
	
		Path path4= Paths.get("/land/hippo/harry.happy");
		System.out.println("The Path Name is : " + path4);
		for (int i = 0; i < path4.getNameCount(); i++) {
			
			System.out.println(" Element " + i+ " " + "is: " + path4.getName(i));
			
		}
		
		
		var p= Path.of("/");
		
		System.out.println(p.getNameCount());
		System.out.println(p.getName(0)); // IllegalArgumentException
	
	}

}
