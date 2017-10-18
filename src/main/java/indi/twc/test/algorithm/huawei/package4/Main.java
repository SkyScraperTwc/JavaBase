package indi.twc.test.algorithm.huawei.package4;
import java.util.Scanner;

//ͳ��ÿ�������ӵ�����
public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int N = scan.nextInt();
			System.out.println(getTotalCount(N));
		}
	}
	
	public static int getTotalCount(int monthCount){
		if(monthCount==1 || monthCount==2){ 
			return 1;
		}
		 
		
		return getTotalCount(monthCount-1)+getTotalCount(monthCount-2);
    }
}
  