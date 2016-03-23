package lab13.filesearch;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
//PSEUDO-CODE
boolean searchForFile(Object file, Object startDir) {
	Object[] fileSystemObjects =
						startDir.getContents();
	for(Object o: fileSystemObjects) {
		//base case
		if(isFile(o) && isSameFile(o,f)) {
			return true;
		}

		if(isDirectory(o)) {
			searchForFile(file, o);
		}
	}
	//file not found in startDir
	return false;
}
*/
	
public class FileSearch {
	static boolean found = false;
	//Store the text that is found in the
	//file that is found in this String variable
	static String discoveredText = null;
	public static boolean searchForFile(String filename, String startDir) throws IOException {
		//implement
		File d = new File(startDir);
		File[] files = d.listFiles();
		for(File f: files) {
			if(f.isFile() && f.getName().toString().equals(filename)) {
				FileReader r = new FileReader(f);
				BufferedReader reader = new BufferedReader(r);
				String line = null;
				discoveredText = new String();
				 while((line = reader.readLine()) != null) {
				  	//do something with the line
					 discoveredText += line;
				 }
				 reader.close();
				 System.out.println(discoveredText);
				found = true;
			}
			if(f.isDirectory()) {
				String dir = f.toString();
				searchForFile(filename, dir);
			}
		}
		return found;	
	}
	
	

}
