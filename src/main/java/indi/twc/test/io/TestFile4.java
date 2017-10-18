package indi.twc.test.io;

import java.io.File;

public class TestFile4 {

	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\TanWC\\Desktop\\file");
		if(f1.isDirectory()){
			String[] names = f1.list();
			   for (String str : names) {
				   System.out.println(str);
			}
		}
		System.out.println("------------");
		File f2 = new File("C:\\Users\\TanWC\\Desktop\\file");
		if(f2.isDirectory()){
			File[] files = f2.listFiles();
			   for (File file : files) {
					   System.out.println(file);
			}
		}
	}
}
