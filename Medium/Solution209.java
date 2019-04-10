/**  
* @Title: Solution209.java——
* @Package MiddleCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月25日 上午10:12:07
* @version V1.0  
*/
package MiddleCode;

/**
* @ClassName: Solution209——长度最小的子数组   滑动窗口问题
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月25日 上午10:12:07
*/
public class Solution209 {
    public static int minSubArrayLen(int s, int[] nums) {
        int l = 0; 
        int r = -1;
        int sum = 0;
        int res = nums.length + 1;
        while(l < nums.length){
        	
        	if(r+1 < nums.length && sum < s)
        		sum += nums[++r];
        	else
        		sum -= nums[l++];
        	
        	if(sum >= s)
        		res = Math.min(res, r-l+1);
        	if(res == 1)
        		return res;
        }
        
        if(res == nums.length + 1)
        	return 0;
        return res;
    }
    public static void main(String[] args) {
		int nums[] = {2,3,1,2,4,3};
		int s = 7;
		System.out.println(minSubArrayLen(s, nums));
	}
}
