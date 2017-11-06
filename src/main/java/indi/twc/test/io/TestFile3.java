package indi.twc.test.io;

import java.io.File;
import java.io.IOException;

public class TestFile3 {

	public static void main(String[] args) throws IOException {
      File f1 = new File("a.txt"); 
      f1.createNewFile();
      System.out.println(f1.getAbsolutePath());

      System.out.println("---------"+System.getProperty("user.dir"));
	}

}
