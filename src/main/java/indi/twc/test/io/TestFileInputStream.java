package indi.twc.test.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;


public class TestFileInputStream {

	public static void main(String[] args) throws IOException {
		InputStream in = null;
		try {
			in = new FileInputStream("C:\\Users\\TanWC\\Desktop\\file\\a.txt");
			System.out.println(in.available());
			byte[] b = new byte[in.available()];
			in.read(b);//�Ӵ��������н���� b.length ���ֽڵ����ݶ���һ�� byte �����С�
			System.out.println(Arrays.toString(b));
   			
			
			String str = new String(b);
			System.out.println(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			if(in!=null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	}
}

