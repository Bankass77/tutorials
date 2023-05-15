package certification.tutorials.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class test {

	public static void main(String[] args) throws IOException{
	 var x= Path.of("/animals/fluffy/..");
	 
	 Files.walk(x.toRealPath().getParent()).map(p->p.toAbsolutePath().toString())
	 .filter(s->s.endsWith(".java")).forEach(System.out::println);

	}

}
