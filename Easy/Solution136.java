/**  
* @Title: Solution136.java——
* @Package EasyCode_02
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年4月13日 下午1:59:22
* @version V1.0  
*/
package EasyCode_02;

import java.util.Arrays;

/**
* @ClassName: Solution136——只出现一次的数字
* @Description: TODO  非空整数数组    要求：线性时间复杂度O（n），空间复杂度O（1）
* @author msdumin@gmail.com
* @date 2019年4月13日 下午1:59:22
*/
public class Solution136 {
	//这个时间复杂度实际上是不符合要求的，但还是在leetcode上通过了测试
/*    public int singleNumber(int[] nums) {
        //先排序
    	Arrays.sort(nums);
    	for(int i = 0 , j = 1 ; j < nums.length ; ) {
    		if(nums[i] != nums[j])
    			return nums[i];
    		else{
    			i +=2;
    			j +=2;
    		}
    	}
    	return nums[nums.length - 1];
    }*/
    
    //大神解法：根据异或运算的特点，相同的数字经过异或运算后结果为0，除单独出现一次的数字外，其他数字都是出现两次的，
	//那么这些数字经过异或运算后结果一定是0。而任何数字与0进行异或运算都是该数字本身。所以对数组所有元素进行异或运算，运算结果就是题目的答案。
    public static int singleNumber(int[] nums) {
        int ans = nums[0];
    	for(int i = 1, len = nums.length; i < len; i++){
    	    ans ^= nums[i];
    	}
    	return ans;
    }
    
    public static void main(String[] args) {
		int[] nums = {1,3,3,4,5,1,4,6,5};
		System.out.println(singleNumber(nums));
	}
}
