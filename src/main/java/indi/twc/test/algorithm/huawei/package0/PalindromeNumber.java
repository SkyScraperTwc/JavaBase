package indi.twc.test.algorithm.huawei.package0;

public class PalindromeNumber {

	public static void main(String[] args) {
		boolean result = check(-123321);   
		System.out.println(result); 
	}     
	 
	public static boolean check(long x){ 
		String str = String.valueOf(x);
		char[] ch = str.toCharArray();
		int clength = ch.length;  
		//ż��
		if(str.length()%2==0){
			for (int i = 0; i < clength/2; i++) { 
				if(ch[i]!=ch[clength-1-i]){  
					return false;
				} 
			}  
		}      
		//����
		if(str.length()%2!=0){ 
			for (int i = 0; i < clength/2+1; i++) {
				if(ch[i]!=ch[clength-1-i]){
					return false;
				}   
			} 
		} 
		
		return true;   
	} 
}
