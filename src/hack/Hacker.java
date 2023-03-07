package hack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Hacker {

	void writeHistory(List<String> history) throws IOException {

		try (BufferedWriter myWriter = new BufferedWriter(
				new FileWriter(new File("/Users/belbin-pt7165/Desktop/History.txt"), true))) {
			for (String url : history) {
				myWriter.write(url);
				myWriter.write("\r\n");
			}

		} catch (Exception e) {
			System.out.println("Something went wrong..");
		}

	}

	ArrayList<String> readHistory() throws IOException {
		ArrayList<String> history = new ArrayList<>();
		try (BufferedReader bf = new BufferedReader(new FileReader("/Users/belbin-pt7165/Desktop/History.txt"))) {

			String line = bf.readLine();
			while (line != null) {
				history.add(line);
				line = bf.readLine();
			}

		} catch (FileNotFoundException fileNotFound) {
			System.out.println("There is no such file found");
		}
		return history;

	}

}
