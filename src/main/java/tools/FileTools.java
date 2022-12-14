package tools;

import java.io.FileReader;
import java.io.IOException;

public class FileTools {
	public static FileReader getFileReader(String filePath) {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(filePath);
		} catch (IOException e) {
			System.out.println("could not find file...");
			e.printStackTrace();
		}

		return fileReader;
	}
}
