package tools;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class CleanerReader {
	BufferedReader reader;

	public CleanerReader(FileReader fileReader) {
		reader = new BufferedReader(fileReader);
	}

	public boolean ready() {
		boolean ready = false;

		try {
			ready = reader.ready();
		} catch (IOException e) {
			System.out.println("error reading line in file...");
			e.printStackTrace();
			return false;
		}

		return ready;
	}

	public String readLine() {
		String line = null;

		try {
			line = reader.readLine();
		} catch (IOException e) {
			System.out.println("error reading line in file...");
			e.printStackTrace();
			return null;
		}

		return line;
	}
}
