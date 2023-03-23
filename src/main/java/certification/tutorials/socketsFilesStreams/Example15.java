package certification.tutorials.socketsFilesStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Example15 {

	public static void main(String[] args) throws IOException {

		if (args.length != 2) {

			System.err.print("Usage: java EchoClient <host name > <port number>");
			System.exit(1);
		}

		String hostName = args[0];
		int portNumber = Integer.parseInt(args[1]);

		try (Socket echoSocket = new Socket(hostName, portNumber);

				PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);

				BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));

				BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))

		) {

			String userInput;
			while ((userInput = stdIn.readLine()) != null) {
				out.println(userInput);

				if (userInput.substring(0, 3).equals("bye")) {

					System.out.println("Bye bye!");
					System.exit(0);
				}
				System.out.println("Echo: " + in.readLine());
			}

		} catch (UnknownHostException e) {
			System.err.print("Don't know about host " + hostName);
			System.exit(1);
		} catch (Exception e) {
			System.err.print("Couldn't get I/O for the connection to " + hostName);
			System.exit(1);
		}
	}

}
