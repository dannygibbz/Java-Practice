package AppendingText;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextAdd {

	public static void main(String[] args)throws IOException {
		FileWriter file = new FileWriter("MyNewFile.txt", true);
		BufferedWriter newDoc = new BufferedWriter(file);
		newDoc.write("Welcome to the new file.");
		newDoc.newLine();
		newDoc.close();
		file.close();

	}

}
