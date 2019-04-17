/**  
* @Title: Solution343.java——
* @Package MiddleCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年4月16日 上午9:49:25
* @version V1.0  
*/
package MiddleCode_01;

import java.util.Arrays;

/**
* @ClassName: Solution343——整数拆分
* @Description: TODO 给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
输入: 10
输出: 36
解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36。
* @author msdumin@gmail.com
* @date 2019年4月16日 上午9:49:25
*/
public class Solution343 {
/*	//记忆化搜索：自顶向下递归
	private int[] memo;
	private int max3(int a , int b , int c){
		return Math.max(a, Math.max(b, c));
	}
	private int breakIntoTwo(int n) {
		
		//递归结束条件
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
	
	//动态规划：自底向上不采用递归解决问题
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
