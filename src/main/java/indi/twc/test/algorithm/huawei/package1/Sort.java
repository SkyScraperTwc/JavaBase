package indi.twc.test.algorithm.huawei.package1;

import java.util.Arrays;

public class Sort {
	
	public static void main(String[] args) {
//		sort();
		bulbleSort();
//		selectSort();
//		findMin(); 
//		insertSort();  
	} 
	
	/**
	 * ��������   
	 */ 
	public static void quickSort(int a[], int low, int high) {     
		if(low < high){
			//��������λ��
			int index = partition(a,low,high);
			//�ݹ�������������
			quickSort(a,low,index-1);
			//�ݹ�������������
			quickSort(a,index+1,high); 
		}
		  
	}  
   /**
    *  ������������һ��Ԫ�أ���Ϊ����׼��  
    *  �����������У�����Ԫ�رȻ�׼ֵС�İڷ��ڻ�׼ǰ�棬����Ԫ�رȻ�׼ֵ��İ��ڻ�׼�ĺ���
    */
	public static int partition(int a[], int low, int high){
		int pivot = a[low];//ȡ��һ������Ϊ��׼ֵ
		 
		while(low < high){ 
			
			while(low < high&& a[high]>=pivot)
				high--;
			swap(a,low,high);
			
			while(low<high && a[low]<=pivot)
				low++;
			swap(a,low,high);
		}
		
		return low; 
	}
	
	public static void swap(int a[], int low, int high){
		int temp;
		temp = a[low];
		a[low] = a[high];
		a[high] = temp;
	}
	
	
	/**
	 * ������
	 */
	public static void sort(){
		int a[] = {2,6,8,4,1,9,3,8,10,11,12,7,5};  
		  
		for (int i = 0; i < a.length; i++) { 
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]){
					int temp = a[i]; 
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}  
		System.out.println(Arrays.toString(a)); 
	}
	
	/**
	 * ð������ 
	 */
	public static void bulbleSort(){
		int a[] = {2,6,8,4,1,9,3,8,10,11,12,7,5};  
		  
		for (int i = 0; i < a.length; i++) {
			for (int j = a.length-1; j > i; j--) {
				if(a[j-1]>a[j]){ 
					int temp = a[j]; 
					a[j] = a[j-1];   
					a[j-1] = temp;  
				} 
			}
		}  
		System.out.println(Arrays.toString(a)); 
	}
	
	/**
	 * ѡ������
	 */
	public static void selectSort(){ 
		int a[] = {2,6,8,4,1,9,3,8,10,12,11,12,7,5};  
		int min;//����
		for (int i = 0; i < a.length; i++) { 
			min = i; 
			for (int j = i+1; j < a.length; j++) {
				if(a[min]>a[j]){     
					min = j;
				}
			} 
			if(min!=i){
				int temp = a[min];  
				a[min] = a[i];    
				a[i] = temp; 
			}
		}  
		System.out.println(Arrays.toString(a));
	}
	 
	/**
	 * �������� 
	 */ 
	public static void insertSort() {    
		int a[] = {2,6,8,4,1,9,3,8,10,12,13,12,7,5};  
		int temp,j;
		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			for (j = i; j>0 && temp<a[j-1]; j--) {
				a[j] = a[j-1]; 
			} 
			a[j] = temp;
		}
	    System.out.println(Arrays.toString(a));
	}  
	
	
	
	public static void findMin(){ 
		int a[] = {2,6,8,4,1,-1,9,3,56,10,11,12,7,5};  
		int max = a[0];
		for (int i = 1; i < a.length; i++) { 
			if(a[i]>max){ 
			   max = a[i]; 
		}  
	} 
		System.out.println(max);
 }
}

