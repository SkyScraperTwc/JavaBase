package indi.twc.test.io;
/**
 * createNewFile()-����һ���µ��ļ�
mkdir-����һ���ļ��У����ǲ��ܴ����㼶
mkdirs - �����㼶�ļ���
renameTo() - �ļ����������ƶ�
delete - ɾ���ļ����ļ���
 */
import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\TanWC\\Desktop\\file\\m.txt");
		f1.createNewFile();
		
		File f2 = new File("C:\\Users\\TanWC\\Desktop\\file\\e");
		f2.mkdir();
		 
		File f3 = new File("C:\\Users\\TanWC\\Desktop\\file\\d\\c\\c\\a");
		f3.mkdirs();
		
		 
		File f4 = new File("C:\\Users\\TanWC\\Desktop\\file\\z.txt");
		f4.renameTo(new File("C:\\Users\\TanWC\\Desktop\\file\\e\\z.txt"));
		
		File f5 = new File("C:\\Users\\TanWC\\Desktop\\file\\k.txt");
		f5.delete();
	}
}
