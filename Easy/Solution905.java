/**  
* @Title: Solution905.java——
* @Package EasyCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年4月1日 下午5:23:35
* @version V1.0  
*/
package EasyCode_01;

/**
* @ClassName: Solution905——
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年4月1日 下午5:23:35
*/
public class Solution905 {
    public static int[] sortArrayByParity(int[] A) {
        int len = A.length;
        //弄个非原地的  开辟一个新数组
        int[] res = new int[A.length];
        
        int p = 0 , q = len - 1;
        for( int i = 0; i < len ; i++){
        	if(A[i] % 2 == 0){
        		res[p] = A[i];
        		p++;
        	}else{
        		res[q] = A[i];
        		q--;
        	}
        }
        return res;
    }
    public static void main(String[] args) {
		int[] arr1 = {3,1,2,4};
		int[] ans = sortArrayByParity(arr1);
		System.out.print(ans + " ");
	}
}
