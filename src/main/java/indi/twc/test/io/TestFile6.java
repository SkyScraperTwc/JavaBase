package indi.twc.test.io;
//�ݹ�
//�ݹ�
//һ���ַ�=2���ֽ�
import java.io.File;

public class TestFile6 {

	public static void main(String[] args) {
//		go();
		File f2 = new File("C:\\Users\\TanWC\\Desktop\\file\\notepad++.exe");
		if(f2.isDirectory()){
			System.out.println("�ļ���");
		}else if(f2.isFile()){
			System.out.println("�ļ�");
		}else{
			System.out.println(f2.getPath()+"�����ļ�Ҳ�����ļ���");
		}
		
		
		File f1 = new File("C:\\Users\\TanWC\\Desktop\\file");
		list(f1);
		
		
	}
 
	public static void list(File f){
		if(f.isFile()){
			System.out.println(f.getName());
		}else{
			System.out.println(f.getName());
			File[] files = f.listFiles();//���·��
			  for (File file : files) {
				  list(file);
		}
	}
  }	
	public static void go( ){
		System.out.println(10);
		go();
	}
}
