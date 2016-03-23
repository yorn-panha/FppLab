package lab13.filesearch;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.Before;

public class Test {

	static File insert;
	private String expectedText = "This is the file you are seeking!";
	// /Volumes/MAC DATA/Java Project/FppLessonDemo/src/lab13/filesearch/testCode
	private String setupDirectory = "C:\\testCode";
	//private String setupDirectory = "/Volumes/MAC DATA/testCode";
	private String targetFile = "seek.txt";
	
	@Before
	public void setUp() {
//		//File f = new File("C:\\testCode\\level1\\level2\\finalLevel");
//		File f = new File("/Volumes/MAC DATA/testCode/level1/level2/finalLevel");
//		System.out.println(f.mkdirs());
//		//f = new File("C:\\testCode\\level1\\level2a\\thirdLevel");
//		f = new File("/Volumes/MAC DATA/testCode/level1/level2a/thirdLevel");
//		System.out.println(f.mkdirs());
//		//f = new File("C:\\testCode\\level1\\level2b\\thirdLevelb");
//		f = new File("/Volumes/MAC DATA/testCode/level1/level2b/thirdLevelb");
//		System.out.println(f.mkdirs());
//		//f = new File("C:\\testCode\\level1\\level2b\\thirdLevelc\\fourthLevel");
//		f = new File("/Volumes/MAC DATA/testCode/level1/level2b/thirdLevelc/fourthLevel");
//		System.out.println(f.mkdirs());
//		//insert = new File(f.getAbsolutePath() + "\\seek.txt");
//		insert = new File(f.getAbsolutePath() + "/seek.txt");
//		System.out.println("writing to " + insert.getAbsolutePath());
		
		File f = new File("C:\\testCode\\level1\\level2\\finalLevel");
		System.out.println(f.mkdirs());
		f = new File("C:\\testCode\\level1\\level2a\\thirdLevel");
		System.out.println(f.mkdirs());
		f = new File("C:\\testCode\\level1\\level2b\\thirdLevelb");
		System.out.println(f.mkdirs());
		f = new File("C:\\testCode\\level1\\level2b\\thirdLevelc\\fourthLevel");
		System.out.println(f.mkdirs());
		insert = new File(f.getAbsolutePath() + "\\seek.txt");
		System.out.println("writing to " + insert.getAbsolutePath());
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(insert)));
			pw.write(expectedText);
			pw.flush();
			pw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	@org.junit.Test
	public void testSearchForFile() throws IOException {
		
		boolean result = FileSearch.searchForFile(targetFile, setupDirectory);
		//System.out.println("result: " + result);
		assertTrue(result);
		assertTrue(expectedText.equals(FileSearch.discoveredText.trim()));
	
	}

}
