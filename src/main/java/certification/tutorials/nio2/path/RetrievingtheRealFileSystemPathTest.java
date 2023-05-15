package certification.tutorials.path;

import java.io.IOException;
import java.nio.file.Paths;

public class RetrievingtheRealFileSystemPathTest {
	
	
	public static void main(String[] args)  throws IOException {
		
		System.out.println(Paths.get(".").toRealPath());
		System.out.println(Paths.get("/home/lorumsum.txt").toRealPath());
		
		System.out.println(Paths.get(".././lorumsum.txt").toRealPath());
		
	}

}
