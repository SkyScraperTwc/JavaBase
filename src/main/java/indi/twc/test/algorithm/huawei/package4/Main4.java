package indi.twc.test.algorithm.huawei.package4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ������
 * @author Administrator
 *
 */
public class Main4 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int[] weight = new int[n];
			int[] nums = new int[n];
			for (int i = 0; i < weight.length; i++) {
				weight[i] = scan.nextInt();
			}
			for (int i = 0; i < nums.length; i++) {
				nums[i] = scan.nextInt();
			}
			int size = fama(n,weight,nums);
			System.out.println(size);
		}
	}
	/**
	 * ע��������������0
	 * @param n
	 * @param weight
	 * @param nums
	 * @return
	 */
	public static int fama(int n, int[] weight, int[] nums){
		  List<Integer> list=new ArrayList<Integer>();
	        list.add(0);
	        for(int i=0;i<n;i++)
	        {
	            int size=list.size();
	            for(int j=0;j<size;j++)
	            {
	                for(int k=1;k<=nums[i];k++)
	                {
	                    int temp=k*weight[i]+list.get(j);
	                    if(!list.contains(temp))
	                        list.add(temp);
	                }
	            }
	             
	        }
	        return list.size();
	}
}
  