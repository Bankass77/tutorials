package certification.tutorials.socketsFilesStreams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Example11 {

	public static void main(String[] args) {

		String pathString = System.getProperty("user.home") + "/javaTemp/numbers.txt";

		Path pathFile = Paths.get(pathString);

		// if the numbers file doesn't exist, create a file with 10 random numbers

		// between 0 and 10 , so that we can make something with them

		if (Files.notExists(pathFile)) {

			int[] numbers = new int[10];

			for (int i : numbers) {

				numbers[i] = (int) (Math.random() * 10);
			}

			try {

				// create an empty filereading a Properties File
				Files.createFile(pathFile);

				// Write the bytes one by one

				for (int i : numbers) {
					Files.write(pathFile, Arrays.asList("" + i), StandardOpenOption.APPEND);
				}
			} catch (Exception e) {
				System.out.println("Warning: issue creating random numbers file" + e.getMessage());
			}
		}

		// one the numbers file exists , we can open it and play around with the data

		try {

			List<String> fileContent = Files.readAllLines(pathFile);

			// this will go through the buffer containing the whole file
			// and print it line by one to System.out
			System.out.println("Raw data");
			fileContent.forEach(System.out::println);
			System.out.println(); // add an OEL

			// this will go through the sorted buffer containing the whole file
			// and print it line by one to System.out

			System.out.println("Sorted data");

			fileContent.stream().sorted().forEach(System.out::println);
			System.out.println();// add EOL

			// this will go through the mapped buffer containing the whole file
			// multiply each number by 2 and print it line by one to System.out

			System.out.println("Mapped data");
			fileContent.stream().map(x -> Integer.parseInt(x) * 2).forEach(System.out::println);
			System.out.println();

			// this will go through the mapped buffer containing the whole file
			// make average and print it line by one to System.out
			System.out.println("sum of data");
			fileContent.stream().map(x -> Integer.parseInt(x)).reduce(Integer::sum);

		} catch (Exception e) {
			System.out.println("Warning: there was an issue with the file.");
		}

	}

}
