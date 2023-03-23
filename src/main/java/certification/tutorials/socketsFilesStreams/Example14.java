package certification.tutorials.socketsFilesStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Example14 {

	public static void main(String[] args) throws IOException {

		// Check if the port have selected for server
		// if no port was chosen, the programm will simply exit
		if (args.length != 1) {
			System.err.print("Usage: java EchoServer <port number>");
			System.exit(1);

		}

		int portNumber = Integer.parseInt(args[0]);

		try

		(ServerSocket serverSocket = new ServerSocket(Integer.parseInt(args[0]));

				// Will block the server and make it wait until a connection arrives
				Socket clientSocket = serverSocket.accept();

				// for output streams
				PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

				// For input streams
				BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));)

		{

			String inputLine;
			int contID = 0;
			while ((inputLine = in.readLine()) != null) {
				contID++;
				out.println(contID + "-" + inputLine);

				if (inputLine.substring(0, 3).equals("bye")) {
					System.out.println("Bye bye!");
					System.exit(0);
				}
			}
		} catch (IOException e) {
			System.out.println(
					"Exception caught when trying ti listen on port " + portNumber + "or listening for a connection");
			System.out.println(e.getMessage());
		}

	}

}
