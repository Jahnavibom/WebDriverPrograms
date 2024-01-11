package Oct18;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class File_Creation {

	public static void main(String[] args) throws Throwable {
		// Write a script to create a file and write text into it
		File f = new File("D:/sample.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter aw =new BufferedWriter(fw);
		// writing text into a file
		aw.write("I am a house wife");
		//for going to new line
		aw.newLine();
		aw.write("I am learning selenium");
		aw.newLine();
		aw.write("I am a good mother");
		aw.flush();
		aw.close();
		
		
		

	}

}
