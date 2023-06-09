package certification.tutorials.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class FindUserEmailEndWith {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bufferedReader.readLine().trim());
		String firstNameRegex = "^[a-z]{2,}$";
		String emailRegex = "^[a-z]+([.-][a-z]+)*@[a-z]+([.-][a-z]+)*\\.[a-z]{2,}$";
        
		Pattern p = Pattern.compile(firstNameRegex);

		Pattern pattern = Pattern.compile(emailRegex);

		if (N < 2) {
			return;
		}

		List<String> valideUserList = new ArrayList<>();
		IntStream.range(0, N).forEach(NItr -> {
			try {
				String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

				String firstName = firstMultipleInput[0];

				String emailID = firstMultipleInput[1];

				Matcher matcher = p.matcher(firstName);
				Matcher matcher2 = pattern.matcher(emailID);

				while (matcher.find() && matcher2.find()&& emailID.endsWith("@gmail.com")) {

					valideUserList.add(firstName);

				}

			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});
		
		Collections.sort(valideUserList);
		for (String string : valideUserList) {

			System.out.println(string);

		}
		bufferedReader.close();
	}
}
