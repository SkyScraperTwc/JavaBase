package indi.twc.test.algorithm.huawei.package2;
 
import java.util.Scanner;
import java.util.TreeSet;

public class Main3{ 
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){ 
			TreeSet<Integer> treeSet = new TreeSet<Integer>();
			int n = scan.nextInt(); 
			
			for (int i = 0; i < n; i++) {
				int number = scan.nextInt();
				treeSet.add(number);
			}
			
			for (Integer integer : treeSet) {
				System.out.println(integer);
			}
		} 
	}    
	 
}
             
     
   
