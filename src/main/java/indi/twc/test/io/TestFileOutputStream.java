package indi.twc.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestFileOutputStream {

	public static void main(String[] args) throws IOException {
		OutputStream out = null;
		try {
			out = new FileOutputStream("C:\\Users\\TanWC\\Desktop\\file\\a.txt",true);
			String str = "�������22112";
			byte[] b =  str.getBytes();
			out.write(b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			if(out!=null){
				out.close();
			}
		}
			
	}

}
