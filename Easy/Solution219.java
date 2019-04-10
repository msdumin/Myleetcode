/**  
* @Title: Solution219.java——
* @Package EasyCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月26日 下午9:47:17
* @version V1.0  
*/
package EasyCode_01;

import java.util.HashSet;
import java.util.Set;

/**
* @ClassName: Solution219——存在重复元素 II
* @Description: TODO
* 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。
* @author msdumin@gmail.com
* @date 2019年3月26日 下午9:47:17
*/
public class Solution219 {
 /*   public boolean containsNearbyDuplicate(int[] nums, int k) {
        //解法1：试试O(n2)的暴力解法  好吧虽然用时稍长 但竟然通过了...
    	for(int i = 0 ; i < nums.length ; i ++){
    		for(int j = i + 1 ; j < nums.length ; j ++){
    			if(nums[j] == nums[i]){
    				int dis = j - i;
    				if(dis <= k)
    					return true;
    			}
    		}
    	}
    	return false;
    }*/
	
	public boolean containsNearbyDuplicate(int[] nums, int k){
		//解法2：滑动窗口法
		if(nums == null || nums.length <= 1)
			return false;
		if(k <= 0)
			return false;
		
		Set<Integer> record = new HashSet<>();
		for (int i = 0; i < nums.length; i ++) {
			if(record.contains(nums[i]))
				return true;
			
			record.add(nums[i]);
			//保持窗口长度一直为k+1
			if(record.size() == k + 1)
				record.remove(nums[i - k]);
		}
		return false;
	}
}
