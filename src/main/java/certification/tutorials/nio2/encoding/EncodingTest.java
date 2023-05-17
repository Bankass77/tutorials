package certification.tutorials.nio2.encoding;

import java.nio.charset.Charset;

public class EncodingTest {

	public static void main(String[] args) {

		String userName = "Bob";

		Charset usAsciiCharset = Charset.forName("US-ASCII");
		Charset utf8Charset = Charset.forName("UTF-8");
		Charset utf16Charset = Charset.forName("UTF-16");

		System.out.println(new String(usAsciiCharset.encode(userName).array()));

		System.out.println(new String(utf8Charset.encode(userName).array()));

		System.out.println(new String(utf16Charset.encode(userName).array()));
	}

}
