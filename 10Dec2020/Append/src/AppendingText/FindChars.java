package AppendingText;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class FindChars {

	public static void main(String[] args) {
		
		int numWords = 0;
		
		Scanner myFile = null;
		try {
			Scanner file = new Scanner(new File("src/test.txt"));
			myFile = file;
			
		} catch (java.io.FileNotFoundException e) {
			System.out.println("Your file does not exist.");
		}
		while(myFile.hasNextLine()) {
			String curLine = myFile.nextLine();
			int size = curLine.length();
			boolean foundDiv = true;
			boolean foundChar = false;
			for (int i = 0; i < size; i++ ) {
				/*User can input the character they wish to search here*/
				if (curLine.charAt(i) == 't') {
					foundDiv = true;
					foundChar = false;
				} else {
					foundChar = true;
					
				}
				if(foundChar && foundDiv) {
					numWords++;
					foundDiv = false;
				}
			}
			
		}
		myFile.close();
		System.out.println("The letter you searched appeared " + numWords + " times in the file.");
		
	}

}
