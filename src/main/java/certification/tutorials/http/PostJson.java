package certification.tutorials.http;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class PostJson {

	public static void main(String[] args) {
		/*
		 * {
		 * 
		 * "animal": "dog", "name": "biff" }
		 */

		String content = "{\"animal\": \"dog\", \"name\": \"biff\"}";
		String path = "http://httpbin.org/post";

		try {

			URL url = new URL(path);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setDoOutput(true);
			DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
			outputStream.writeBytes(content);
			outputStream.flush();
			outputStream.close();

			int responseCode = connection.getResponseCode();
			System.out.println("Code: " + responseCode);

			if (responseCode != HttpURLConnection.HTTP_OK) {

				System.out.println("Got an unexpected response code");
			}
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

			reader.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
