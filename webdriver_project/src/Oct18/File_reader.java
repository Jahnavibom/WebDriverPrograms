package Oct18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class File_reader {

	public static void main(String[] args) throws Throwable {
		// Write a script to read line by line from a text file
		File f = new File("D:/sample.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
br.close();
	}

}
