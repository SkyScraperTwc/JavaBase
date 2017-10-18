package indi.twc.test.algorithm.huawei.package4;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * ����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ���
 * @author Administrator
 *
 */
public class Main3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.nextLine();
			HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
			hashMap.put(0, 0);//Ӣ����ĸ
			hashMap.put(1, 0);//�ո�
			hashMap.put(2, 0);//����
			hashMap.put(3, 0);//�����ַ�
			char[] ch = str.toCharArray();
			
			for (int i = 0; i < ch.length; i++) {
				if('A'<=ch[i] && ch[i]<='Z' || 'a'<=ch[i] && ch[i]<='z'){
					int oldValue = hashMap.get(0);
					hashMap.put(0, oldValue+1);
				}else if(ch[i]==' '){
					int oldValue = hashMap.get(1);
					hashMap.put(1, oldValue+1);
				}else if('0'<=ch[i] && ch[i]<='9'){
					int oldValue = hashMap.get(2);
					hashMap.put(2, oldValue+1);
				}else{
					int oldValue = hashMap.get(3);
					hashMap.put(3, oldValue+1);
				}
			}
			
			for (Entry<Integer,Integer> entry: hashMap.entrySet()) {
				System.out.println(entry.getValue());
			}
		}
	}
	
}
  