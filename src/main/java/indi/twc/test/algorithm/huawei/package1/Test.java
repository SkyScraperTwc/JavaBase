package indi.twc.test.algorithm.huawei.package1;

public class Test{ 
	private int a = 0;
	//-2147483648~+2147483647
	public static void main (String[] args) throws Exception{
		System.out.println(test(-21474841));
		System.out.println(Integer.MAX_VALUE); 
		System.out.println(Integer.MIN_VALUE);
	}  
	 
	public static int test(int x){ 
		int max = Integer.MAX_VALUE; //2147483647
		int min = Integer.MIN_VALUE;//-2147483648
		long result = 0;     
		String str = String.valueOf(x);//整形转字符串  
		char[] ch = str.toCharArray();//字符串转字符数组   
		if(ch[0]=='-'){  
			for (int i = ch.length-1; i > 0 ; i--) {
				  int a = Integer.valueOf(ch[i])-48;//  
				  result = (long) (result+ (a*Math.pow(10, i-1)));//数字重组
			}  
			if(-result<min){  
				return 0;   
			}
			return (int) -result; 
		}else{   
			for (int i = ch.length-1; i >=0 ; i--) {  
				  int a = Integer.valueOf(ch[i])-48;  
				  result = (long) (result+(a*Math.pow(10, i)));
			}
			if(result>max){  
				return 0; 
			}
			return (int) result;
		}    
	} 
	 
}  
 
