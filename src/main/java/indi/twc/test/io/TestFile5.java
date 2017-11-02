package indi.twc.test.io;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class TestFile5 {

	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\TanWC\\Desktop\\file");
		TxtFileNameFile filter = new TxtFileNameFile();
		String[] names = f1.list(filter);
		for(String name : names){
			   System.out.println(name);
		}
		
		File[] files = f1.listFiles(new DirFileFilter());
		  for (File file : files) {
				   System.out.println(file.getAbsolutePath());
		}
		
	}

}

class TxtFileNameFile implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		if(name.endsWith(".txt")){
			return true;
		}
		return false;
	}
}

class  DirFileFilter implements FileFilter{

	@Override
	public boolean accept(File file) {
		if(file.isDirectory()){
			return true;
		}
		return false;
	}
}
