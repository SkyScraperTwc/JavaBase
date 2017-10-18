package indi.twc.test.io;
/**
 * isFile() - �ж��Ƿ����ļ�
isDirectory() - �ж��Ƿ���Ŀ¼
getName() - ����ļ���
getAbsolutePath() - ����ļ��ľ���·��
 */
import java.io.File;

public class TestFile2 {

	public static void main(String[] args) {
      File f1 = new File("C:\\Users\\TanWC\\Desktop\\notepad++.exe");
      System.out.println(f1.isFile());
      System.out.println(f1.isDirectory());
      System.out.println(f1.getName());
      System.out.println(f1.getAbsolutePath());
      
      File f2 = new File("C:\\Users\\TanWC\\Desktop\\file\\a.txt");
      System.out.println(f2.isFile());
      System.out.println(f2.isDirectory());
      System.out.println(f2.getName());
      System.out.println(f2.getAbsolutePath());
	}
}
