/**  
* @Title: Solution922.java——
* @Package EasyCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年4月1日 下午8:51:24
* @version V1.0  
*/
package EasyCode_01;

/**
* @ClassName: Solution922——
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年4月1日 下午8:51:24
*/
public class Solution922 {
    public int[] sortArrayByParityII(int[] A) {
    	
        int[] res = new int[A.length];
        int p = 0 , q = 1;
        for(int i = 0 ; i < A.length ; i ++){
        	if(A[i] % 2 == 0){
        		res[p] = A[i];
        		p+=2;
        	}else{
        		res[q] = A[i];
        		q+=2;
        	}
        }
        return res;
    }
}
