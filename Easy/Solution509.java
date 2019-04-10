/**  
* @Title: Solution509.java����
* @Package EasyCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��4��1�� ����9:00:18
* @version V1.0  
*/
package EasyCode_01;

/**
* @ClassName: Solution509����
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��4��1�� ����9:00:18
*/
public class Solution509 {
    public int fib(int N) {
//    	//�ݹ�ʵ��
//        if(N==0)	return 0;
//        if(N == 1)	return 1;
//        return fib(N - 1) + fib(N - 2);
        //�ǵݹ�ʵ��
        int[] ans = new int[N + 1];
        if(N < 2)	return N;
        ans[0] = 0;
        ans[1] = 1;
        for(int i = 2 ; i < N + 1 ; i ++){
        	ans[i] = ans[i - 2] + ans[i - 1];
        }
        return ans[N];
    }
}
