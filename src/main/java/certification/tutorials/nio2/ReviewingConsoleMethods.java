package certification.tutorials.nio2;

import java.io.Console;
import java.util.Arrays;

public class ReviewingConsoleMethods {
	// TODO Auto-generated method stub

	public static void main(String[] args) {
		
		Console console= System.console();
		if (console==null) {
			
			throw new RuntimeException("Console not avilable");
			
		}else{
			String name= console.readLine("Please entre your name: ");
			console.writer().format(" Hi %s", name);
			
			console.writer().println();
			console.format("What is your address? ");
			String address= console.readLine();
			
			char [] password= console.readPassword("Enter your password, between %d and %d characters", 5, 10 );
			char [] verify= console.readPassword("Enter again your password: ");
			console.printf("Passwords" + (Arrays.equals(password, verify) ? "match" : "do not match"));
			
			
		}
	
	}

}
