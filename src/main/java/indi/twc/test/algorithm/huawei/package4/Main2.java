package indi.twc.test.algorithm.huawei.package4;
import java.util.Scanner;

//ͳ��ÿ�������ӵ�����
public class Main2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int N = scan.nextInt();
			System.out.println(getJourney(N));
			System.out.println(getTenthHigh(N));
		}
	}
 /**
 * ͳ�Ƴ���5�����ʱ��������������?
 * 
 * @param high �����ʼ�߶�
 * @return Ӣ����ĸ�ĸ���
 */
	 public static double getJourney(int high){
		 double a = (double)high;
		 double j = a+a+a/2+a/2/2+a/2/2/2;
	        return j;
	 }
 /**
     * ͳ�Ƴ���5�η������?
     * 
     * @param high �����ʼ�߶�
     * @return �ո�ĸ���
     */
	 public static double getTenthHigh(int high){
	        return (double)high/2/2/2/2/2;
	 }
}
  