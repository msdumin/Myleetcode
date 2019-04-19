/**  
* @Title: Solution300.java——
* @Package MiddleCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年4月18日 下午9:47:30
* @version V1.0  
*/
package MiddleCode_01;

import java.util.Arrays;

/**
* @ClassName: Solution300——最长上升子序列
* @Description: TODO 给定一个无序的整数数组，找到其中最长上升子序列的长度。
* @author msdumin@gmail.com
* @date 2019年4月18日 下午9:47:30
*/
public class Solution300 {
    public static int lengthOfLIS(int[] nums) {
    	//上升子序列，当两个元素相等时，不算作上升
    	
    	if(nums.length == 0 || nums == null)
    		return 0;
    	if(nums.length == 1)
    		return 1;
    	//每个元素的初始长度为1
    	int n = nums.length;
    	//memo[i]用来存放以i结尾的元素的最长上升子序列的长度
        int[] memo = new int[n+1];
        Arrays.fill(memo, 1);
        int res = 1;
        
        for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if(nums[j] < nums[i])
					//memo[i]的值就是以元素i结尾的最长上升子序列的长度再加1
					memo[i] = Math.max(memo[i], memo[j] + 1);
			}
		}
        for (int i = 0; i < memo.length; i++) {
			res = Math.max(res, memo[i]);
		}
        return res;
    }
    public static void main(String[] args) {
		int[] nums = {};
		System.out.println(lengthOfLIS(nums));
	}
}
