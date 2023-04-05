package certification.tutorials.stream;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class testStream {

		public void printData(InputStream in) throws IOException {
			   var w = new StringBuilder();
			   try(in; var o = new BufferedOutputStream(System.out)) {
			      w.append((char) in.read());
			      in.skip(1);
			      in.read();
			      in.skip(0);
			      w.append((char)in.read());
			      o.flush();
			   }
			   System.out.println(w);
			}

	public static void main(String[] args) {
		
	}

}
