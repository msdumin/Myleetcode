/**  
* @Title: Solution231.java——
* @Package EasyCode_02
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年4月17日 上午11:23:46
* @version V1.0  
*/
package EasyCode_02;

/**
* @ClassName: Solution231——2的幂
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年4月17日 上午11:23:46
*/
public class Solution231 {
	
	public static boolean isPowerOfTwo(int n){
		if(n == 0)
			return false;
		if(n == 1)
			return true;
		
		if(n % 2 == 0){
			return isPowerOfTwo(n/2);
		}else
			return false;
	}
	
	public static void main(String[] args) {
		int n = 64;
		System.out.println(isPowerOfTwo(n));
	}
	
}
