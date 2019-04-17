/**  
* @Title: Solution343.java����
* @Package MiddleCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��4��16�� ����9:49:25
* @version V1.0  
*/
package MiddleCode_01;

import java.util.Arrays;

/**
* @ClassName: Solution343�����������
* @Description: TODO ����һ�������� n��������Ϊ���������������ĺͣ���ʹ��Щ�����ĳ˻���󻯡� ��������Ի�õ����˻���
����: 10
���: 36
����: 10 = 3 + 3 + 4, 3 �� 3 �� 4 = 36��
* @author msdumin@gmail.com
* @date 2019��4��16�� ����9:49:25
*/
public class Solution343 {
/*	//���仯�������Զ����µݹ�
	private int[] memo;
	private int max3(int a , int b , int c){
		return Math.max(a, Math.max(b, c));
	}
	private int breakIntoTwo(int n) {
		
		//�ݹ��������
		if(n == 1)
			return 1;
		if(memo[n] != -1)
			return memo[n];
		
		int res = -1;
		for(int i = 1 ; i < n ; i ++ ) {
			res = max3(res , i * (n - i) , i * breakIntoTwo(n - i));
		}
		memo[n] = res;
		return res;
	} 
	
    public int integerBreak(int n) {
    	if(n < 1)
    		throw new IllegalArgumentException("n should be greater than zero");
    	
    	memo = new int[n+1];
    	Arrays.fill(memo, -1);
    	return breakIntoTwo(n);
    }*/
	
	//��̬�滮���Ե����ϲ����õݹ�������
	private static int max3(int a , int b , int c){
		return Math.max(a, Math.max(b, c));
	}
	
	public static int integerBreak(int n) {
		if(n == 1)
			return 1;
		
		int[] memo = new int[n+1];
		Arrays.fill(memo , -1);
		
		memo[1] = 1;
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++) {
				memo[i] = max3(memo[i] , j*(i-j) , j*memo[i - j]);
			}
		}
		return memo[n];
	}
	public static void main(String[] args) {
		int n = 2;
		System.out.println(integerBreak(n));
	}
}
